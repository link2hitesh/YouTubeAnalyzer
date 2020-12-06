package models;


import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.Video;
import com.google.api.services.youtube.model.VideoListResponse;
import com.google.api.services.youtube.model.VideoLocalization;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.FileDataStoreFactory;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;

import com.google.common.collect.Lists;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.StoredCredential;
import com.google.api.client.http.HttpTransport;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

/**
 * Class calling youtube api to display video view count
 * 
 * @author Adeyinka
 *
 */
public class VideoStats {

	public static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();


	public static final JsonFactory JSON_FACTORY = new JacksonFactory();

	private static final String CREDENTIALS_DIRECTORY = ".oauth-credentials";

	public VideoStats() {

	}

	/**
	 * @param scopes
	 * @param credentialDatastore
	 * @return youtube Oauth client secrets
	 * @throws IOException
	 */
	public static Credential authorize(List<String> scopes, String credentialDatastore) throws IOException {

		Reader clientSecretReader = new InputStreamReader(VideoStats.class.getResourceAsStream("/client_secrets.json"));
		GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, clientSecretReader);

		if (clientSecrets.getDetails().getClientId().startsWith("Enter")
				|| clientSecrets.getDetails().getClientSecret().startsWith("Enter ")) {
			System.out.println(
					"Enter Client ID and Secret from https://console.developers.google.com/project/_/apiui/credential "
							+ "into src/main/resources/client_secrets.json");
			System.exit(1);
		}

		FileDataStoreFactory fileDataStoreFactory = new FileDataStoreFactory(new File(System.getProperty("user.home") + "/" + CREDENTIALS_DIRECTORY));
		DataStore<StoredCredential> datastore = fileDataStoreFactory.getDataStore(credentialDatastore);

		GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
				HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, scopes).setCredentialDataStore(datastore)
				.build();

		LocalServerReceiver localReceiver = new LocalServerReceiver.Builder().setPort(8080).build();

		return new AuthorizationCodeInstalledApp(flow, localReceiver).authorize("user");
	}




	/**
	 * @param videoId
	 * @return Videos view count
	 */
	public  String  search(String videoId)  {
		Video video = null ;
		try {

			List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube");
			Credential credential = authorize(scopes, "localizations");
			YouTube youtube;
			youtube = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), credential)
					.setApplicationName("youtube-cmdline-localizations-sample").build();
			VideoListResponse videoListResponse = youtube.videos().
					list("snippet,localizations,contentDetails, statistics").setId(videoId).execute();

			List<Video> videoList = new ArrayList<Video>();

			List<Video> videoListresp = videoListResponse.getItems();

			videoListresp.forEach(v->

			{
				
					videoList.add(v);
				
			}
					);

			video = videoList.get(0);

			return video.getStatistics().getViewCount().toString();


		}catch (GoogleJsonResponseException e) {
			System.err.println("There was a service error: " + e.getDetails().getCode() + " : "
					+ e.getDetails().getMessage());
		} catch (IOException e) {
			System.err.println("There was an IO error: " + e.getCause() + " : " + e.getMessage());
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return video.getStatistics().getViewCount().toString();

	}


}

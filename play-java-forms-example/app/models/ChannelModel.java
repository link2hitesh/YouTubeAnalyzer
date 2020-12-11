package models;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.StoredCredential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.Channel;
import com.google.api.services.youtube.model.ChannelListResponse;
import com.google.common.collect.Lists;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



/**
 *
 * The code from this class is inspired by google data api @see https://github.com/youtube/api-samples/blob/master/java/src/main/java/com/google/api/services/samples/youtube/cmdline/data/Search.java
 * @author Adeyinka
 *
 */
public class ChannelModel  {

	public static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();


	public static final JsonFactory JSON_FACTORY = new JacksonFactory();

	private static final String CREDENTIALS_DIRECTORY = ".oauth-credentials";

	/**
	 * constructor
	 */
	public ChannelModel() {
	}


	/**
	 * @param channelId
	 * @return a list of channel properties 
	 */
	public List<String> Search(String channelId) {
		List<String> replyList = new ArrayList<String>();
		try {
			ChannelListResponse response ;
			List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube");
			Credential credential = authorize(scopes, "localizations");
			YouTube youtubeService = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), credential)
					.setApplicationName("youtube-cmdline-localizations-sample").build();

			String key = "AIzaSyAICKvdtM_OGwgAjMmKLdABHSfP1JO218A";
			YouTube.Channels.List request = youtubeService.channels()
					.list("id,snippet,topicDetails,statistics,contentDetails").setId(channelId);
			response = request.execute();


			List<Channel> chanelListResp = response.getItems();


			chanelListResp.forEach(c->{
				if(!chanelListResp.isEmpty()) {

					replyList.add(c.getSnippet().getDescription());

					replyList.add(c.getSnippet().getTitle());

					replyList.add(c.getSnippet().getPublishedAt().toStringRfc3339());
					replyList.add(c.getSnippet().getThumbnails().getDefault().getUrl());
					replyList.add(String.valueOf(c.getStatistics().getSubscriberCount()));
					replyList.add(String.valueOf(c.getStatistics().getVideoCount()));
					replyList.add(String.valueOf(c.getStatistics().getViewCount()));

				}

			});

			//  System.out.println(replyList);
			return replyList;

		}catch (GoogleJsonResponseException e) {
			System.err.println("There was a service error: " + e.getDetails().getCode() + " : "
					+ e.getDetails().getMessage());
		} catch (IOException e) {
			System.err.println("There was an IO error: " + e.getCause() + " : " + e.getMessage());
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return replyList;
	}

	/**
	 * @param scopes
	 * @param credentialDatastore
	 * @return youtube Oauth client secrets
	 * @throws IOException
	 */
	public static Credential authorize(List<String> scopes, String credentialDatastore) throws IOException {

		Reader clientSecretReader = new InputStreamReader(ChannelModel.class.getResourceAsStream("/client_secrets.json"));
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



}

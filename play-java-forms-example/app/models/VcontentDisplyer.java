package models;

import TestingInterface.VedioInterface;

import java.util.Arrays;
import java.util.List;
/**
 * This class is used to call the data api when it is called from the controller and call's the mock of data api when called from test class
 * @author Ankur Aggarwal
 */
public class VcontentDisplyer implements VedioInterface {

    /**
     * This method arrange the data
     * @param Query is the channel Id of the video owner
     * @return List of string containing video title,Date,author
     */

public List<String> Find_Fields(String Query) {
    List<String> contentFinal;

    if(Query.equals("UC9DXAsBD4-ITVuvpd68401Q")){
        contentFinal= Arrays.asList("Title1//<>//Date1//<>//Author1","Title2//<>//Date2//<>//Author2");

    }else {
        channelContent Content = new channelContent();
        contentFinal = Content.ChannelContent(Query);
    }
return  contentFinal;
}



}

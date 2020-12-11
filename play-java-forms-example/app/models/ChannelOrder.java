package models;

import controllers.WidgetController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This class is used to format the result for the channel videos
 * @ ankur aggarwal
 */


public class ChannelOrder {
    /**
     * This method sort result on the basis of search term
     *
     */

    public static boolean samequery1(channelvideolist Query,String field_S){
        String Q1 = Query.title;
        String search = field_S;
        if (Q1.contains(search)){
            return true;
        }
        else {
            return false;
        }

    }



    /**
     * This method is used to reverse the order to list
     *
     */
       public static List<channelvideolist> Reverse_order(List<channelvideolist> Reverse){

           int size= Reverse.size();
           List<channelvideolist> RList= new ArrayList<>();
           for(int i=size-1; i>=0; i--)
           {
             RList.add(Reverse.get(i));
           }
        return RList;
       }





    /**
     * This method sort result on the basis of date followed by search term
     *
     */

    public static List<channelvideolist> sortedlist(List<channelvideolist> list_to_sort, String S_term){

        list_to_sort.sort(Comparator.comparing(channelvideolist::getDate).thenComparing((channelvideolist ch)-> samequery1(ch,S_term)
        ));







        return list_to_sort;
    }






}

package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * This class is used to take the value from the data api and returns the string in the desired format
 * @author Ankur Aggarwal
 */
public class Videospliter {
    /**
     * This method arrange the data
     * @param value  List of string from the data api
     * @return List of string in the format of title of video followed by the date
     */

    public static List<String> vediocontentarranger(List<String> value) {

        List<String> value1 = value;

        List<String> vField = new ArrayList<>();

        for (String first : value1) {
            String parts2[] = Arrays.stream(first.split("//<>//")).map(String::trim).toArray(String[]::new);

                String valuew =parts2[0]+" # DATE OF UPLOAD # "+parts2[1];
                vField.add(valuew);


        }


        return vField;
    }

}



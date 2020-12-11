package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * This class format data
 * @return  the List of type Data
 *
 * @author Ankur Aggarwal
 * @author Adeyinka Areje
 */

public class Split {

    /**
     * Split the string in desired format to so store the value in List
     * @return  the List of type Data
     */

    public  static List<Data>  DataFinder(List<String> s){
        List<Data> finalt = new ArrayList<>();
        List<String> value = s;


        for (String first : value)

        {
            String parts2[] = Arrays.stream(first.split("/>")).map(String::trim).toArray(String[]::new);

            finalt.add(new Data(parts2[0],parts2[1],parts2[2],parts2[4],parts2[3]));

        }


        return finalt;
    }




}





package models;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * This class will call the Youtube Search API inspired by google data api @see https://github.com/youtube/api-samples/blob/master/java/src/main/java/com/google/api/services/samples/youtube/cmdline/data/Search.java
 * The API is modified in such a way so that it returns only the titles of the 100 latest videos.
 * @author Hitesh Agarwal
 */

public class ReturnSimilarContent {

    /**
     * This method will sort the split the list of titles into words and then map them according to their occurences and return
     * list of strings to be printed on the browser.
     *
     * @param searchQuery
     * @return listOfWords
     */

    public static List<String> returnSimilarContent(String searchQuery)


    {

        List<String> titles= new ArrayList<>();
        if(searchQuery.equals("TestWidgets"))
        {
            titles=Arrays.asList("test","I test","I am test ");
        }
        else {
            titles = Search.youtube_Fields(searchQuery, false, 100);
        }
        List<String> listOfWords= new ArrayList<>();
        List<String> words= Stream.of(titles)
                .flatMap(Collection::stream)
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .collect(Collectors.toList());

        Map<String, Integer> countOfWords= new HashMap<>();

        for(int i=0; i<words.size(); i++)
        {

            if(!countOfWords.containsKey(words.get(i)))
            {
                countOfWords.put(words.get(i),1);
            }
            else{
                countOfWords.computeIfPresent(words.get(i), (k, v) -> v + 1);
            }

        }
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        countOfWords.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));


        for (Map.Entry<String,Integer> entry : reverseSortedMap.entrySet()){
            String temp= "Word: "+ entry.getKey()+ " " + "|| Count: "+ Integer.toString(entry.getValue());
            listOfWords.add(temp);
        }

        return listOfWords;
    }


}

// "Word: test || Count: 3","Word: I || Count: 2","Word: am || Count: 1"
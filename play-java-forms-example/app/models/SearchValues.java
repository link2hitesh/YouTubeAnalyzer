package models;

import java.util.ArrayList;
import java.util.List;
import models.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

/**
 * This class creates an object that stores the details of each video in its attributes.
 * @author Adeyinka
 */


public class SearchValues {
    /**
     * items represents a collection of searches
     */
    private List<models.SearchDatas> items;

    /**
     * constructor
     */
    public SearchValues() {

        this.items = new ArrayList<models.SearchDatas>();
    }
    /**
     * Add results in the list
     */

    public void addSearchResult(models.SearchDatas searchResult){

        items.add(searchResult);

    }
    /**
     *  return list of results
     * @return  items
     */

    public List<models.SearchDatas> list(){

        return items;
    }

    /**
     * Add all results to the list
     */

    public void addAll(SearchValues newItems){
        for(int i=0; i< newItems.list().size(); i++){
            items.add(newItems.list().get(i));
        }

    }

    /**
     * remove all results to the list
     */
    public void removeAll(SearchValues newItems){
        for(int i=0; i< newItems.list().size(); i++){
            items.remove(newItems.list().get(i));
        }

    }
}

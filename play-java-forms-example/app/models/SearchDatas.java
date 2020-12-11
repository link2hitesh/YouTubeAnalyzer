package models;

import models.Data;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * This class creates an object that contains the search terms and its associated list of videos.
 *  @author Adeyinka
 */
public class SearchDatas{

    /**
     * Setter for search terms
     * @param searchTerm
     */

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String searchTerm;



    public List<Data> result;

    /**
     * constructor
     */
    public SearchDatas(){
        searchTerm = "";
    result = new ArrayList<Data>();

    }


}
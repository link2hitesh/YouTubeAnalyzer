package models;

import java.util.ArrayList;
import java.util.List;
import models.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchValues {
    /**
     * items represents a collection of searches
     */
    private List<models.SearchDatas> items;


    public SearchValues() {

        this.items = new ArrayList<models.SearchDatas>();
    }


    public void addSearchResult(models.SearchDatas searchResult){

        items.add(searchResult);

    }

    public List<models.SearchDatas> list(){

        return items;
    }


    public void addAll(SearchValues newItems){
        for(int i=0; i< newItems.list().size(); i++){
            items.add(newItems.list().get(i));
        }

    }

    public void removeAll(SearchValues newItems){
        for(int i=0; i< newItems.list().size(); i++){
            items.remove(newItems.list().get(i));
        }

    }
}

package models;

import models.Data;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchDatas{

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String searchTerm;



    public List<Data> result;

    public SearchDatas(){
        searchTerm = "";
    result = new ArrayList<Data>();

    }


}
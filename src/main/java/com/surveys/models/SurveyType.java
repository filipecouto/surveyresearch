package com.surveys.models;

/**
 * Created by filipecouto on 25/03/2017.
 */
public class SurveyType {

    private Long id;
    private String name;

    public SurveyType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

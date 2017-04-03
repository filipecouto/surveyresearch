package com.surveys.models;

/**
 * Created by filipecouto on 25/03/2017.
 */
public class Requester {

    private Long id;
    private String acronym;
    private String name;
    private String endpoint;

    public Requester() {
    }

    public Requester(Long id, String acronym, String name, String endpoint) {
        this.id = id;
        this.acronym = acronym;
        this.name = name;
        this.endpoint = endpoint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}

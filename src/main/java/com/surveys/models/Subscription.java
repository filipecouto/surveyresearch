package com.surveys.models;

/**
 * Created by filipecouto on 02/04/2017.
 */
public class Subscription {

    private Long id;
    private Long providerId;
    private Long requesterId;
    private Long surveyTypeId;
    private String frequency;
    private String channel;

    public Subscription() {
    }

    public Subscription(Long id, Long providerId, Long requesterId, Long surveyTypeId, String frequency, String channel) {
        this.id = id;
        this.providerId = providerId;
        this.requesterId = requesterId;
        this.surveyTypeId = surveyTypeId;
        this.frequency = frequency;
        this.channel = channel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public Long getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Long requesterId) {
        this.requesterId = requesterId;
    }

    public Long getSurveyTypeId() {
        return surveyTypeId;
    }

    public void setSurveyTypeId(Long surveyTypeId) {
        this.surveyTypeId = surveyTypeId;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}

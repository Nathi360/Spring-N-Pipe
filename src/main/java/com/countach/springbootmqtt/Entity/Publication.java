package com.countach.springbootmqtt.Entity;

public class Publication {

    private String pubID;
    private String topic;
    private String content;
    private String username;    //clientID
    private Integer qos;

    public Publication(String topic, String content, String username, Integer qos, String PID) {
        this.topic = topic;
        this.content = content;
        this.username = username;
        this.qos = qos;
        this.pubID = PID;
    }

    public String getPubID() {
        return pubID;
    }

    public String getTopic() {
        return topic;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public Integer getQos() {
        return qos;
    }
}

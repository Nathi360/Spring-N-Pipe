package com.countach.springbootmqtt.Entity;

public class Subscription {

    private String topic;
    private Integer qos;
    private String username;    //clientID

    public Subscription(String topic, Integer qos, String username) {
        this.topic = topic;
        this.qos = qos;
        this.username = username;
    }

    public String getTopic() {
        return topic;
    }

    public Integer getQos() {
        return qos;
    }

    public String getUsername() {
        return username;
    }
}

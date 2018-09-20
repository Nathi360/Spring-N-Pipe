package com.countach.springbootmqtt.Entity;

public class Message {

    private String heading;
    private String body;
    private String source;
    private String topic;
    private Integer qualityOfService;

    public Message(String heading, String body, String source, String topic, Integer qualityOfService) {
        this.heading = heading;
        this.body = body;
        this.source = source;
        this.topic = topic;
        this.qualityOfService = qualityOfService;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    public String getSource() {
        return source;
    }

    public String getTopic() {
        return topic;
    }

    public Integer getQualityOfService() {
        return qualityOfService;
    }
}

package com.learn.rabbitmqpublisher;

import java.io.Serializable;

public class SampleMessage implements Serializable {

    private String title;
    private String description;

    public SampleMessage() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

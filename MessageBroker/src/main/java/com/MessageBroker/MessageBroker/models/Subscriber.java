package com.MessageBroker.MessageBroker.models;

import com.MessageBroker.MessageBroker.constants.EState;

import javax.persistence.Entity;

@Entity
public class Subscriber {

    private long id;
    private String name;
    private Topic topic;
    private EState state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public EState getState() {
        return state;
    }

    public void setState(EState state) {
        this.state = state;
    }
}

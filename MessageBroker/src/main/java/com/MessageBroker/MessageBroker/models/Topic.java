package com.MessageBroker.MessageBroker.models;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Topic {
    private long id;
    private String name;
    private Date retentionTime;
    private TopicData data;

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

    public Date getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Date retentionTime) {
        this.retentionTime = retentionTime;
    }

    public TopicData getData() {
        return data;
    }

    public void setData(TopicData data) {
        this.data = data;
    }
}

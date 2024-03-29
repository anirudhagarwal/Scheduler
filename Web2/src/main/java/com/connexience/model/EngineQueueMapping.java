package com.connexience.model;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * Created by naa166 - Anirudh Agarwal on 09/06/2015.
 */
@Entity
public class EngineQueueMapping {

    @Basic
    private String ipAddress;

    @Basic
    private String queueName;

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getIpAddress() {

        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}

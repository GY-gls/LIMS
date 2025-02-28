package com.kb.lims.dto;

import java.io.Serializable;
import java.sql.Timestamp;

//@Data
public class TicketDTO implements Serializable {

    private String initiator;

    private String receiver;

    private String auditor;

    private Integer benchId;

    private Timestamp startDate;

    private Timestamp endDate;

    private String state;

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Integer getBenchId() {
        return benchId;
    }

    public void setBenchId(Integer benchId) {
        this.benchId = benchId;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

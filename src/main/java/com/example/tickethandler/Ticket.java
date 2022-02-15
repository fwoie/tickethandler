package com.example.tickethandler;

import java.sql.Time;
import java.time.LocalTime;

public class Ticket {
    private Integer id;
    private Time created;
    private Time scheduledTime;
    private String job;
    private String contractorID;
    private String customerID;
    private String status;

    Ticket(Integer id, String job, String customerID){
        this.id = id;
        this.job = job;
        this.customerID = customerID;
        this.created = Time.valueOf(LocalTime.now());
    }

 
    public Integer getId() {
        return id;
    }
  
    public Time getCreated() {
        return created;
    }


    public Time getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Time scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    
    public String getContractorID() {
        return contractorID;
    }

    
    public void setContractorID(String contractorID) {
        this.contractorID = contractorID;
    }

    
    public String getCustomerID() {
        return customerID;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Ticket(id: " + this.id + ", created: " + this.created + ", scheduledTime: " + this.scheduledTime + ", job: " + this.job + "contractorID: " + this.contractorID + ", customerID: " + this.customerID + ", status:" + this.status;
    }

}
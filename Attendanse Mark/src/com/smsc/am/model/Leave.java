/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.model;

/**
 *
 * @author SASANGA
 */
public class Leave {
    
    private long id;
    private long employeeId;
    private long typeId;
    private String fromDate;
    private String toDate;
    private String description;

    public Leave() {
    }

    public Leave(long id, long employeeId, long typeId, String fromDate, String toDate, String description) {
        this.id = id;
        this.employeeId = employeeId;
        this.typeId = typeId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public long getTypeId() {
        return typeId;
    }

    public String getToDate() {
        return toDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

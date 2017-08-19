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
public class Attendance {
    
    private long id;
    private long employeeId;
    private String inTime;
    private String outTime;
    private String date;
    private int isOt;

    public Attendance() {
    }

    public Attendance(long id, long employeeId, String inTime, String outTime, String date, int isOt) {
        this.id = id;
        this.employeeId = employeeId;
        this.inTime = inTime;
        this.outTime = outTime;
        this.date = date;
        this.isOt = isOt;
    }

    

    public long getId() {
        return id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getInTime() {
        return inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public String getDate() {
        return date;
    }

    public int getIsOt() {
        return isOt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setIsOt(int isOt) {
        this.isOt = isOt;
    }
    
}

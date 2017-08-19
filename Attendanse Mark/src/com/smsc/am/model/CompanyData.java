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
public class CompanyData {
    
    private long id;
    private String name;
    private String otTime;

    public CompanyData() {
    }

    public CompanyData(long id, String name, String otTime) {
        this.id = id;
        this.name = name;
        this.otTime = otTime;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the otTime
     */
    public String getOtTime() {
        return otTime;
    }

    /**
     * @param otTime the otTime to set
     */
    public void setOtTime(String otTime) {
        this.otTime = otTime;
    }
    
    
    
}

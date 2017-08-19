/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.controller;

import com.smsc.am.dao.LeaveTypeDAO;
import com.smsc.am.model.LeaveType;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SASANGA
 */
public class LeaveTypeController {
    
    private final LeaveTypeDAO leaveTypeDAO = new LeaveTypeDAO();
    
    public boolean newLeaveType(LeaveType leaveType) throws ClassNotFoundException, SQLException {
        
        int isAddLeaveType = leaveTypeDAO.addLeaveType(leaveType);
        
        return isAddLeaveType > 0;
    }
    
    public ArrayList<LeaveType> listLeaveTypes() throws ClassNotFoundException, SQLException {
        ArrayList<LeaveType> listLeaveTypes = leaveTypeDAO.listLeaveTypes();
        if (!listLeaveTypes.isEmpty()) {
            return listLeaveTypes;
        } else {
            return null;
        }
    }
    
    public boolean deleteLeaveTypeById(long id) throws ClassNotFoundException, SQLException {
        int isdeleteLeaveType = leaveTypeDAO.deleteLeaveType(id);
        return isdeleteLeaveType > 0;
    }
    
    public boolean updateLeaveType(LeaveType leaveType) throws ClassNotFoundException, SQLException {
        int isUpdateLeaveType = leaveTypeDAO.updateLeaveType(leaveType);
        return isUpdateLeaveType > 0;
    }
    
    public LeaveType searchLeveTypeByName(String name) throws ClassNotFoundException, SQLException {
        return leaveTypeDAO.searchLeaveTypeByName(name);
    }
    
}

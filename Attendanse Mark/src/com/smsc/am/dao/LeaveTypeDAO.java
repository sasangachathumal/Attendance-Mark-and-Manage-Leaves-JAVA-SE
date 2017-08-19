/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.dao;

import com.smsc.am.db.DBController;
import com.smsc.am.model.LeaveType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SASANGA
 */
public class LeaveTypeDAO {
    
    public int addLeaveType(LeaveType leaveType) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO LEAVE_TYPE VALUES(?,?,?)");
        ps.setObject(1, leaveType.getId());
        ps.setObject(2, leaveType.getName());
        ps.setObject(3, leaveType.getDescription());
        return ps.executeUpdate();
    }
    
    public int updateLeaveType(LeaveType leaveType) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE LEAVE_TYPE SET NAME=?,DESCRIPTION=? WHERE ID=?");
        ps.setObject(3, leaveType.getId());
        ps.setObject(1, leaveType.getName());
        ps.setObject(2, leaveType.getDescription());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
    public int deleteLeaveType(Long ID) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE LEAVE_TYPE WHERE ID=?");
        ps.setObject(1, ID);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
    public LeaveType searchLeaveTypeByName(String name) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM LEAVE_TYPE WHERE NAME='"+name+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet executeQuery = cstm.executeQuery(sql);
        if (executeQuery.next()) {
            return new LeaveType(executeQuery.getLong(1), executeQuery.getString(2), executeQuery.getString(3));
        } else {
            return null;
        }
    }
    
    public ArrayList<LeaveType> listLeaveTypes() throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM LEAVE_TYPE");
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<LeaveType> list=new ArrayList<>();
        while(executeQuery.next()){
            LeaveType leaveTypes = new LeaveType(executeQuery.getLong(1), executeQuery.getString(2), executeQuery.getString(3));
            list.add(leaveTypes);
        }
        return list;
    }
    
}

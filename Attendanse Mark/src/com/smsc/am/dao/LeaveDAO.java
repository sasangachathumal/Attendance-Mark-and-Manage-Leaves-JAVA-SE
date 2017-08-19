/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.dao;

import com.smsc.am.db.DBController;
import com.smsc.am.model.Leave;
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
public class LeaveDAO {
    
    public int addLeaves(Leave leave) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO LEAVES VALUES(?,?,?,?,?,?)");
        ps.setObject(1, leave.getId());
        ps.setObject(2, leave.getEmployeeId());
        ps.setObject(3, leave.getTypeId());
        ps.setObject(4, leave.getFromDate());
        ps.setObject(5, leave.getToDate());
        ps.setObject(6, leave.getDescription());
        return ps.executeUpdate();
    }
    
    public int updateLeave(Leave leave) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE LEAVES SET FROM_DATE=?,TO_DATE=?,TYPE=?,DESCRIPTION=? WHERE ID=?");
        ps.setObject(5, leave.getId());
        ps.setObject(1, leave.getFromDate());
        ps.setObject(2, leave.getToDate());
        ps.setObject(3, leave.getTypeId());
        ps.setObject(4, leave.getDescription());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
    public int deleteLeave(Long ID) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE LEAVES WHERE ID=?");
        ps.setObject(1, ID);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
//    public Emplyee searchUser_byName(String email) throws ClassNotFoundException, SQLException{
//        String sql="SELECT * FROM EMPLOYEE WHERE EMAIL='"+email+"'";
//        Connection connection = DBController.createConnection().getConnection();
//        Statement cstm = connection.createStatement();
//        ResultSet executeQuery = cstm.executeQuery(sql);
//        if (executeQuery.next()) {
//            return new Emplyee(executeQuery.getLong(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4), executeQuery.getString(5));
//        } else {
//            return null;
//        }
//    }
//    
//    public ArrayList<Emplyee> listUsers() throws ClassNotFoundException, SQLException{
//        Connection connection = DBController.createConnection().getConnection();
//        PreparedStatement ps = connection.prepareStatement("SELECT * FROM EMPLOYEE");
//        ResultSet executeQuery = ps.executeQuery();
//        ArrayList<Emplyee> list=new ArrayList<>();
//        while(executeQuery.next()){
//            Emplyee emaploies = new Emplyee(executeQuery.getLong(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4), executeQuery.getString(5));
//            list.add(emaploies);
//        }
//        return list;
//    }
    
}

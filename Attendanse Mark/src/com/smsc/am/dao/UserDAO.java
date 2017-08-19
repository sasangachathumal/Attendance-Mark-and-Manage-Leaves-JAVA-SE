/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.dao;

import com.smsc.am.db.DBController;
import com.smsc.am.model.Emplyee;
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
public class UserDAO {
    
    public int addUser(Emplyee emplyee) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)");
        ps.setObject(1, emplyee.getId());
        ps.setObject(2, emplyee.getEmail());
        ps.setObject(3, emplyee.getName());
        ps.setObject(4, emplyee.getPhoneNumber());
        ps.setObject(5, emplyee.getPassword());
        ps.setObject(6, emplyee.getType());
        return ps.executeUpdate();
    }
    
    public int updateUser(Emplyee emplyee) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE EMPLOYEE SET NAME=?,PN_NUMBER=?,EMAIL=? WHERE ID=?");
        ps.setObject(4, emplyee.getId());
        ps.setObject(1, emplyee.getName());
        ps.setObject(2, emplyee.getPhoneNumber());
        ps.setObject(3, emplyee.getEmail());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
    public int changePassword(Emplyee emplyee) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE EMPLOYEE SET PASSWORD=? WHERE ID=?");
        ps.setObject(2, emplyee.getId());
        ps.setObject(1, emplyee.getPassword());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
    public int deleteUser(Long ID) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE EMPLOYEE WHERE ID=?");
        ps.setObject(1, ID);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
    public Emplyee searchUser_byName(String email) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM EMPLOYEE WHERE EMAIL='"+email+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet executeQuery = cstm.executeQuery(sql);
        if (executeQuery.next()) {
            return new Emplyee(executeQuery.getLong(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4), executeQuery.getString(5), executeQuery.getInt(6));
        } else {
            return null;
        }
    }
    
    public ArrayList<Emplyee> listUsers() throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM EMPLOYEE");
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<Emplyee> list=new ArrayList<>();
        while(executeQuery.next()){
            Emplyee emaploies = new Emplyee(executeQuery.getLong(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4), executeQuery.getString(5), executeQuery.getInt(6));
            list.add(emaploies);
        }
        return list;
    }
    
    public ArrayList<Emplyee> listUsersByType(int type) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE TYPE=?");
        ps.setObject(1, type);
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<Emplyee> list=new ArrayList<>();
        while(executeQuery.next()){
            Emplyee emaploies = new Emplyee(executeQuery.getLong(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4), executeQuery.getString(5), executeQuery.getInt(6));
            list.add(emaploies);
        }
        return list;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.dao;

import com.smsc.am.db.DBController;
import com.smsc.am.model.CompanyData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SASANGA
 */
public class CompanyDataDAO {
    
    public int addCompanyData(CompanyData companyData) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO COMPANY_DATA VALUES(?,?,?)");
        ps.setObject(1, companyData.getId());
        ps.setObject(2, companyData.getName());
        ps.setObject(3, companyData.getOtTime());
        return ps.executeUpdate();
    }
    
    public int updateCompanyData(CompanyData companyData) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE COMPANY_DATA SET NAME=?,OT_TIME=? WHERE ID=?");
        ps.setObject(3, companyData.getId());
        ps.setObject(1, companyData.getName());
        ps.setObject(2, companyData.getOtTime());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
    public int deleteCompanyData(Long ID) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE COMPANY_DATA WHERE ID=?");
        ps.setObject(1, ID);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
    public CompanyData searchCompanyData() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM COMPANY_DATA";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet executeQuery = cstm.executeQuery(sql);
        if (executeQuery.next()) {
            return new CompanyData(executeQuery.getLong(1), executeQuery.getString(2), executeQuery.getString(3));
        } else {
            return null;
        }
    }
    
}

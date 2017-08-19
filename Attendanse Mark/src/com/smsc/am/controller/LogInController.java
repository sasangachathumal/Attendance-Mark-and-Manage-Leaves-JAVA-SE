/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.controller;

import com.smsc.am.dao.UserDAO;
import com.smsc.am.model.Emplyee;
import java.sql.SQLException;

/**
 *
 * @author SASANGA
 */
public class LogInController {
    
    private final UserDAO userDAO = new UserDAO();
    
    public boolean login(String userEmail, String password) throws ClassNotFoundException, SQLException {
        Emplyee searchUser_byEmail = userDAO.searchUser_byName(userEmail);
        if (searchUser_byEmail != null) {
            if (searchUser_byEmail.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}

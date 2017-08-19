/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.controller;

import com.smsc.am.dao.UserDAO;
import com.smsc.am.model.Emplyee;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SASANGA
 */
public class UserController {
    private final UserDAO userDAO = new UserDAO();
    
    public boolean registerNewSystemUserOrEmployee(Emplyee emplyee) throws ClassNotFoundException, SQLException {
        int isAddUser = userDAO.addUser(emplyee);
        return isAddUser > 0;
    }
    
    public ArrayList<Emplyee> listUsers() throws ClassNotFoundException, SQLException {
        ArrayList<Emplyee> emplyeeList = userDAO.listUsers();
        if (!emplyeeList.isEmpty()) {
            return emplyeeList;
        } else {
            return null;
        }
    }
    
    public ArrayList<Emplyee> listUsersByType(int type) throws ClassNotFoundException, SQLException {
        ArrayList<Emplyee> emplyeeList = userDAO.listUsersByType(type);
        if (!emplyeeList.isEmpty()) {
            return emplyeeList;
        } else {
            return null;
        }
    }
    
    public boolean deleteUser(long id) throws ClassNotFoundException, SQLException {
        int isDeleteUser = userDAO.deleteUser(id);
        return isDeleteUser > 0;
    }
    
    public boolean updateUser(Emplyee emplyee) throws ClassNotFoundException, SQLException {
        int isUpdateUser = userDAO.updateUser(emplyee);
        return isUpdateUser > 0;
    }
    
    public boolean changePassword(Emplyee emplyee) throws ClassNotFoundException, SQLException {
        int isChangePassword = userDAO.changePassword(emplyee);
        return isChangePassword > 0;
    }
    
    public Emplyee searchUserByName(String name) throws ClassNotFoundException, SQLException {
        return userDAO.searchUser_byName(name);
    }
    
}

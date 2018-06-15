/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticsquare.thrillio.dao;

import com.semanticsquare.thrillio.entities.User;
import java.util.List;
import thrillio.DataStore;


/**
 *
 * @author Umer-Home
 */


public class UserDao {
    public List<User> getUsers(){
        return DataStore.getUsers();
    }
}

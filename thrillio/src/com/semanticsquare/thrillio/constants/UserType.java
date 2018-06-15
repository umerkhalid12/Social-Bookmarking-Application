/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticsquare.thrillio.constants;


/**
 *
 * @author Umer-Home
 */


public enum UserType {

    USER("user"), 
    EDITOR ("editor"),
    CHIEFEDITOR("chiefeditor");
    
    
    private UserType(String name) {
       this.name = name;
    }
    private String name;
    public String getName(){
        return name;
        
    }
}

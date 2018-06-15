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


public enum Gender {

    
    MALE(0),
    FEMALE(1),
    TRANSGENDER(2);

    private Gender(int gender) {
        this.gender = gender;
    }
    
    private int gender;
    public int getGender(){
        return gender;
    }
}

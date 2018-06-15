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


public enum KidsFriendlyStatus {
    
    APPROVED("approved"),
    REJECTED("rejected"),
    UNKNOWN("unknown");
    
    private KidsFriendlyStatus(String eglibile){
        this.eglibile = eglibile;
    }
    private String eglibile;
    public String getKidsFriendlyStatus(){
        return eglibile;
    }
}

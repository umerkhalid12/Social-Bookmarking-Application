/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.KidsFriendlyStatus;


/**
 *
 * @author Umer-Home
 */


public abstract class Bookmark {

    @Override
    public String toString() {
        return "Bookmark{" + "id=" + id + ", title=" + title + ", profileUrl=" + profileUrl + '}';
    }

    private long id;
    private String title;
    private String profileUrl;
    private KidsFriendlyStatus KidsFriendly = KidsFriendlyStatus.UNKNOWN;

    public void setKidsFriendly(KidsFriendlyStatus KidsFriendly) {
        this.KidsFriendly = KidsFriendly;
    }

    public KidsFriendlyStatus getKidsFriendly() {
        return KidsFriendly;
    }
    
    
    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProfile(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getProfileUrl() {
        return profileUrl;
    }
    
    public abstract boolean isKidFriendlyEligible();

}

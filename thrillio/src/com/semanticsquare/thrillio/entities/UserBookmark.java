/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticsquare.thrillio.entities;


/**
 *
 * @author Umer-Home
 */


public class UserBookmark {

    private User user;
    private Bookmark bookmark;

    public void setUser(User user) {
        this.user = user;
    }

    public void setBookmark(Bookmark bookmark) {
        this.bookmark = bookmark;
    }

    public User getUser() {
        return user;
    }

    public Bookmark getBookmark() {
        return bookmark;
    }

}

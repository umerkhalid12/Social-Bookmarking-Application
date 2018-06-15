/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticsquare.thrillio.controllers;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;


/**
 *
 * @author Umer-Home
 */


public class BookmarkController {

    private static BookmarkController instance = new BookmarkController();

    private BookmarkController() {

    }

    public static BookmarkController getinstance() {
        return instance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
    }
}

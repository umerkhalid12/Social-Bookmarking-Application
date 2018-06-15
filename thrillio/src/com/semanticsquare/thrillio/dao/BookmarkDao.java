/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticsquare.thrillio.dao;

import com.mysql.cj.xdevapi.Statement;
import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.Movie;
import com.semanticsquare.thrillio.entities.UserBookmark;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import thrillio.DataStore;


/**
 *
 * @author Umer-Home
 */


public class BookmarkDao {

    public List<List<Bookmark>> getBookmarks() {
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        //  DataStore.add(userBookmark);
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jid_thrillio?useSSL=false", "root", "root");
                java.sql.Statement stmt = conn.createStatement();) {
            if (userBookmark.getBookmark() instanceof Book) {
                saveUserBook(userBookmark, stmt);
            } else if (userBookmark.getBookmark() instanceof Movie) {
                saveUserMovie(userBookmark, stmt);
            } else {
                saveUserWebLink(userBookmark, stmt);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void saveUserBook(UserBookmark userBookmark, java.sql.Statement stmt) throws SQLException {
        String query = "insert into User_Book (user_id,book_id) value ("
                + userBookmark.getUser().getId() + ", " + userBookmark.getBookmark().getId() + ")";
        stmt.executeUpdate(query);
    }

    private void saveUserMovie(UserBookmark userBookmark, java.sql.Statement stmt) throws SQLException {
        String query = "insert into User_Movie (user_id,movie_id) value ("
                + userBookmark.getUser().getId() + ", " + userBookmark.getBookmark().getId() + ")";
        stmt.executeUpdate(query);
    }

    private void saveUserWebLink(UserBookmark userBookmark, java.sql.Statement stmt) throws SQLException {
        String query = "insert into User_WebLink (user_id,weblink_id) value ("
                + userBookmark.getUser().getId() + ", " + userBookmark.getBookmark().getId() + ")";
        stmt.executeUpdate(query);
    }
}

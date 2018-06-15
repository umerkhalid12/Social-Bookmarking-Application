/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thrillio;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author Umer-Home
 */


public class Launch {

    private static List<User> users;
    private static List<List<Bookmark>> bookmarks;

    private static void loadData() throws SQLException {
        System.out.println("1. Loading data ...");
        DataStore.loadData();

        users = UserManager.getInstance().getUsers();
        bookmarks = BookmarkManager.getInstance().getBookmarks();

//        System.out.println("Printing Data ...");
//        printUserData();
//        printBookmarkData();
    }

   

    private static void printUserData() {
        for(User user: users){
            System.out.println(user);
        }
    }

    private static void printBookmarkData() {
        for (List<Bookmark> bookmarkList : bookmarks) {
            for(Bookmark bookmark : bookmarkList){
                System.out.println(bookmark);
            }
        }

    }
     private static void start() {
         //System.out.println("2. Bookmarking ...");
         for(User user:users){
             View.browse(user, bookmarks);
         }
     }
     public static void main(String[] args) throws SQLException {
        loadData();
        //start();
    }

   
}

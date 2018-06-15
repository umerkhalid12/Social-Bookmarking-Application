/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thrillio;

import com.semanticsquare.thrillio.constants.KidsFriendlyStatus;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.controllers.BookmarkController;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import java.util.List;


/**
 *
 * @author Umer-Home
 */

public class View {

    public static void browse(User user, List<List<Bookmark>> bookmarks) {
        System.out.println("\n" + user.getEmail() + " is browsing items...");
        int bookmarkCount = 0;

        for (List<Bookmark> bookmarkList : bookmarks) {
            for (Bookmark bookmark : bookmarkList) {
                //  if (bookmarkCount < DataStore.getBookmarks().size()) {
                boolean isBookmarked = getBookmarkDecision(bookmark);
                if (isBookmarked) {
                    bookmarkCount++;
                    BookmarkController.getinstance().saveUserBookmark(user, bookmark);
                    System.out.println("New item bookmarked: " + bookmark);
                }
                //  }
                //Mark as kid-friendly
                if (user.getUserType().equals(UserType.CHIEFEDITOR) || user.getUserType().equals(UserType.EDITOR)) {
                    if (bookmark.isKidFriendlyEligible()
                            && bookmark.getKidsFriendly().equals(KidsFriendlyStatus.UNKNOWN)) {
                        KidsFriendlyStatus kidsFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
                        if (!kidsFriendlyStatus.equals(KidsFriendlyStatus.UNKNOWN)) {
                            bookmark.setKidsFriendly(kidsFriendlyStatus);
                            System.out.println("Kid-friendly status: " + kidsFriendlyStatus + " bookmark");
                        }
                    }
                }
            }
        }

    }

//    public static void bookmark(User user, Bookmark[][] bookmarks) {
//        System.out.println("\n" + user.getEmail() + " is bookmarking.");
//        for (int i = 0; i < DataStore.USER_BOOKMARK_LIMIT; i++) {
//            int typeOffset = (int) Math.random() * DataStore.BOOKMARK_TYPES_COUNT;
//            int bookmarkOffset = (int) Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE;
//
//            Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
//            
//            BookmarkController.getinstance().saveUserBookmark(user, bookmark);
//            System.out.println(bookmark);
//        }
//    }
    private static boolean getBookmarkDecision(Bookmark bookmark) {
        return Math.random() < 0.5 ? true : false;
    }

    private static KidsFriendlyStatus getKidFriendlyStatusDecision(Bookmark bookmark) {
        return Math.random() < 0.4 ? KidsFriendlyStatus.APPROVED
                : (Math.random() >= 0.4 && Math.random() < 0.8) ? KidsFriendlyStatus.REJECTED : KidsFriendlyStatus.UNKNOWN;
    }
}

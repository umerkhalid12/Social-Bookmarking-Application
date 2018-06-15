/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.managers.BookmarkManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Umer-Home
 */

public class WebLinkTest {

    public WebLinkTest() {
    }

    @Test
    public void testIsKidFriendlyEligible() {
        //Test 1 prn in url = false
        WebLink weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.javaworld.com");
        boolean isKid = weblink.isKidFriendlyEligible();

        assertFalse("For porn in URL: ", isKid);
//Test 2 porn in title = false

        weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
        isKid = weblink.isKidFriendlyEligible();

        assertFalse("For porn in Title: ", isKid);

        //Test 3 adult in host = false
        weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.adult.com");
        isKid = weblink.isKidFriendlyEligible();

        assertFalse("For Adult in Host: ", isKid);
        //Test 4 adult in url, but no host part = true
        weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html", "http://www.javaworld.com");
        isKid = weblink.isKidFriendlyEligible();

        assertTrue("For adult in URL but no host: ", isKid);
        //Test 5 adult in title = true
        weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
        isKid = weblink.isKidFriendlyEligible();

        assertTrue("For adult in title: ", isKid);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

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


public enum BookGenre {

    ART("Art"),
    BIOGRAPHY("Biography"),
    CHILDREN("Children"),
    FICTION("Fiction"),
    HISTORY("History"),
    MYSTERY("Mystery"),
    PHILOSOPHY("Philosophy"),
    RELIGION("Religion"),
    ROMANCE("Romance"),
    SELF_HELP("Self help"),
    TECHNICAL("Technical");

    private BookGenre(String genre) {
        this.genre = genre;
    }

    private String genre;

    public String getBookGenre() {
        return genre;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticsquare.thrillio.enums;


/**
 *
 * @author Umer-Home
 */


public class Book {

    public enum BookGenre {
        BIOGRAPHY,
        HORROR;

    }

    public static void main(String[] args) {
        for (BookGenre books : BookGenre.values()) {
            System.out.println(books);
            System.out.println(books.name());
            System.out.println(books.hashCode());
            System.out.println(books.ordinal());
            System.out.println(books.getDeclaringClass());

        }
    }
}

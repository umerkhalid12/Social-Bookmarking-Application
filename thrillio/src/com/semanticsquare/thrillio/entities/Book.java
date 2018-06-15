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


public class Book extends Bookmark{

    @Override
    public String toString() {
        return "Book{" + "publicationYear=" + publicationYear + ", publisher=" + publisher + ", authors=" + authors + ", genre=" + genre + ", amazonRating=" + amazonRating + '}';
    }

    private int publicationYear;
    private String publisher;
    private String[] authors;
    private String genre;
    private double amazonRating;
    
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAmazonRating(double amazonRating) {
        this.amazonRating = amazonRating;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getGenre() {
        return genre;
    }

    public double getAmazonRating() {
        return amazonRating;
    }

    @Override
    public boolean isKidFriendlyEligible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

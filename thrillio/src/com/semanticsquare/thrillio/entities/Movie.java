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


public class Movie extends Bookmark {

    @Override
    public String toString() {
        return "Movie{" + "releaseYear=" + releaseYear + ", cast=" + cast + ", directors=" + directors + ", genre=" + genre + ", imdbRating=" + imdbRating + '}';
    }

    private int releaseYear;
    private String[] cast;
    private String[] directors;
    private String genre;
    private double imdbRating;

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public void setDirectors(String[] directors) {
        this.directors = directors;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String[] getCast() {
        return cast;
    }

    public String[] getDirectors() {
        return directors;
    }

    public String getGenre() {
        return genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    @Override
    public boolean isKidFriendlyEligible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

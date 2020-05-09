package com.hiwijaya.pattern.adapter;

public class MovieCatalogAdapter implements CatalogAdapter {

    private Movie movie;

    public MovieCatalogAdapter(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String getCatalogTitle() {
        return movie.getTitle() + " by " + movie.getDirector();
    }

}

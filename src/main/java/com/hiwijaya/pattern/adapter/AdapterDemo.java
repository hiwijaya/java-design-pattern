package com.hiwijaya.pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Novel("Lord of the Rings", "J. R. R. Tolkien"));
        list.add(new Novel("The Hunger Games", "Suzanne Collins"));
        list.add(new Novel("Harry Potter", "J. K Rowling"));

        list.add(new Movie("Pirates of the Caribbean", "Gore Verbinski"));
        list.add(new Movie("13 Hours", "Michael Bay"));
        list.add(new Movie("Olympus Has Fallen", "Antoine Fuqua"));

        list.forEach(item -> {
            if(item instanceof Novel){
                Novel novel = (Novel) item;
                System.out.println(novel.getTitle() + " by " + novel.getAuthor());
            }
            else if(item instanceof Movie){
                Movie movie = (Movie) item;
                System.out.println(movie.getTitle() + " by " + movie.getDirector());
            }
        });


        System.out.println("with adapter: ----------------");


        List<CatalogAdapter> catalog = new ArrayList<>();
        catalog.add(new NovelCatalogAdapter(new Novel("Lord of the Rings", "J. R. R. Tolkien")));
        catalog.add(new NovelCatalogAdapter(new Novel("The Hunger Games", "Suzanne Collins")));
        catalog.add(new NovelCatalogAdapter(new Novel("Harry Potter", "J. K Rowling")));

        catalog.add(new MovieCatalogAdapter(new Movie("Pirates of the Caribbean", "Gore Verbinski")));
        catalog.add(new MovieCatalogAdapter(new Movie("13 Hours", "Michael Bay")));
        catalog.add(new MovieCatalogAdapter(new Movie("Olympus Has Fallen", "Antoine Fuqua")));

        catalog.forEach(item -> {
            System.out.println(item.getCatalogTitle());
        });

    }

}

package com.hiwijaya.pattern.composite;

import java.util.Arrays;
import java.util.List;


public class CompositeDemo {

    public static void main(String[] args) {

//        List<Category> categories = Arrays.asList(
//                new Category("Fashion"),
//                new Category("Electronics"),
//                new Category("Sport")
//        );

        List<Category> categories = Arrays.asList(
                new CompositeCategory("Fashion", Arrays.asList(
                        new Category("Mens"),
                        new Category("Womens"))
                ),
                new CompositeCategory("Electronics", Arrays.asList(
                        new Category("TV"),
                        new CompositeCategory("Gadget", Arrays.asList(
                                new CompositeCategory("Smartphone", Arrays.asList(
                                        new Category("Android"),
                                        new Category("iOS"))),
                                new Category("Tablet"))),
                        new Category("Camera"))
                ),
                new Category("Sport")
        );

        categories.forEach(CompositeDemo::printCategory);

    }

    public static void printCategory(Category category){
        System.out.println(category.getName());

        if(category instanceof CompositeCategory){
            CompositeCategory composite = (CompositeCategory) category;
            composite.getCategories().forEach(c -> printCategory(c));
        }
    }

}

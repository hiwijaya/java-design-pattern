package com.hiwijaya.pattern.composite;


import java.util.List;

public class CompositeCategory extends Category {

    private List<Category> categories;

    public CompositeCategory(String name, List<Category> categories) {
        super(name);
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }
}

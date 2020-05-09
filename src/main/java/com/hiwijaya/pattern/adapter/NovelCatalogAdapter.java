package com.hiwijaya.pattern.adapter;

public class NovelCatalogAdapter implements CatalogAdapter {

    private Novel novel;

    public NovelCatalogAdapter(Novel novel) {
        this.novel = novel;
    }

    @Override
    public String getCatalogTitle() {
        return novel.getTitle() + " by " + novel.getAuthor();
    }
}

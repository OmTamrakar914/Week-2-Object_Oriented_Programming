package com.practiceproblems.librarymanagementsystem;

abstract class LibraryItem {
    // itemId, title, and author
    protected int itemId;
    protected String title;
    protected String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("\n-----Item Details-----");
        System.out.println("Item id   :" + itemId);
        System.out.println("Title     :" + title);
        System.out.println("Author    :" + author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


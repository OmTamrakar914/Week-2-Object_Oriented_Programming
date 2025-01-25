package com.singleinheritance.librarymanager;

class Book{
    //attributes
    protected String title;
    protected int publicationYear;

    //constructor
    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //displayinfo method
    public void displayinfo(){
        System.out.println("------------------Book Details---------------------");
        System.out.println("The Title of the book            : "+title);
        System.out.println("The Publication Year of the book : "+publicationYear);
        System.out.println("---------------------------------------------------");
    }
}
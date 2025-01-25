package com.singleinheritance.librarymanager;

//subclass Author extends Book
class Author extends Book{
    //attributes
    protected String name;
    protected String bio;

    //constructor
    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayinfo(){
        System.out.println("\n------------------Book Details---------------------");
        System.out.println("The Title of the book            : "+title);
        System.out.println("The Publication Year of the book : "+publicationYear);
        System.out.println("The Name of the Author           : "+name);
        System.out.println("The Bio of the Author            : "+bio);
        System.out.println("---------------------------------------------------");
    }
}
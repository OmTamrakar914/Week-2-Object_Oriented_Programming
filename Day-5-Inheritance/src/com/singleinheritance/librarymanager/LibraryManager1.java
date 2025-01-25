package com.singleinheritance.librarymanager;

// Library Managemnt System

public class LibraryManager1{
    public static void main(String[]args){
        Book book = new Book("Never Give up",2002);
        book.displayinfo();

        Author author = new Author("The Alchemist",2003,"Saulo Paolo","Fictional Writer");
        author.displayinfo();
    }
}
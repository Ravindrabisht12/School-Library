package org.example;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public boolean lend(User user){
        return this.isAvailable;
    }

    public void returnBook(User user){
        this.isAvailable = true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    abstract  void displayBookDetails();
}

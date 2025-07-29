package org.example;

public class Member extends  User{
    private  int borrowedBooksCount;
    private  final int MAX_BORROW_LIMIT = 5;

    public void displayDashboard(){
        System.out.println("Member Dashboard and Books Borrowed: X.");
    }

    public boolean canBorrowBooks(){
        return this.borrowedBooksCount < this.MAX_BORROW_LIMIT;
    }

    public Member(){}
}

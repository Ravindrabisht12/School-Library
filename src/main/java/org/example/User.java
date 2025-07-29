package org.example;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    static int totalUsers;

    static int getTotalUsers(){
        return totalUsers;
    }

    public String getName(){
        return this.name;
    }

    public String getContactInfo(){
        return this.contactInfo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

    private String generateUniqueId(){
        return "";
    }

    public User(){
        this.userId = this.generateUniqueId();
    }

    public User(String name, String contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;
        this.userId = this.generateUniqueId();
    }

    public User(User user){
        this.name = user.name;
        this.contactInfo = user.contactInfo;
        this.userId = user.userId;
    }


    abstract void displayDashboard();

    abstract boolean canBorrowBooks();

}

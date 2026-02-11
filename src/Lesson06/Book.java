package Lesson06;

public class Book {
    String title;
    String author;
    int pages;
    private boolean isAvailable;

    Book (String title, String author, int pages, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable =true;
    }
    Book (String title, String author){
        this.title = title;
        this.author = author;
        this.pages = 0;
        this.isAvailable =false;
    }

    // They help protect object data and rules for accessing or modifying them.
    //Getters = Methods that make field READABLE
    // SETTERS = Methods that make field WRITEABLE

        String getTitle(){
        return this.title;
    }
        String getAuthor (){
        return this.author;
    }
        int getPages (){
        return this.pages ;
    }
        boolean getIsAvailable(){
        return this.isAvailable;
    }
    
        void setPages (int pages){
        this.pages = pages ;
        }

        void setIsAvailable (boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public String toString(){
        return "Book name : " + getTitle() + "\n" + "Author : " + getAuthor() + " \n" +
                (isAvailable? "You can rent it" : "Not available");
    }
}

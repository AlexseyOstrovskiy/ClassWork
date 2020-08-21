package com.company;

public class Books {
    private String title;
    private int numberOfPages;

    Books(String title,  int numberOfPages){
        title = this.title;
        numberOfPages = this.numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}

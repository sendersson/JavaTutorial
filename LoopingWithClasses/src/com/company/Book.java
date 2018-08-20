package com.company;

class Book {

    private String title;
    private int pages;
    private boolean isReadable;

    String getTitle(){
        return title;
    }

    void setTitle(String _title){
        title = _title;
    }

    int getPages(){
        return pages;
    }

    void setPages(int _pages){
        pages = _pages;
    }

    boolean getIsReadable(){
        return isReadable;
    }

    void setIsReadable(boolean _isReadable){
        isReadable = _isReadable;
    }

    String Read(){
        if(isReadable){
            return "Titel: " +title +", "+ pages +" sidor";
        }
        return "Not readable";
    }

}

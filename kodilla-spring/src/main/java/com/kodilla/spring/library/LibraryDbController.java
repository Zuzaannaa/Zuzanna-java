package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository
public final class LibraryDbController {
    public void saveData(){
        System.out.println("Saving data to the Database");
    }
    public void loadData(){
        System.out.println("Loading data from the Database");
    }

}

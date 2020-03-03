package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Willow's books");
        library.getBooks().add(new Book("To Bark or not to Bark", "Noah McBard", LocalDate.of(2010, 12, 24)));
        library.getBooks().add(new Book("Year of the Treat", "Melissa B", LocalDate.of(2018, 9, 27)));
        library.getBooks().add(new Book("Driving", "Zuz L", LocalDate.of(2019, 1, 14)));
        library.getBooks().add(new Book("Walking in the Park", "Frosting Punch", LocalDate.of(2018, 4, 5)));

        //Creating a shallow copy of library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Frosting's Books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Creating a deep copy of library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Noah's Books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().add(new Book("A", "b", LocalDate.of(2000, 9, 9)));
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}

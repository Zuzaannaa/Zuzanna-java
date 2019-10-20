package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(451, "Joe", 'M', LocalDate.of(1990, 4, 23), 15));
        usersList.add(new ForumUser(584, "Marie", 'F', LocalDate.of(19887, 12, 17), 79));
        usersList.add(new ForumUser(965, "Breeze", 'M', LocalDate.of(2001, 3, 2), 125));
        usersList.add(new ForumUser(441, "Poop", 'M', LocalDate.of(1988, 11, 24), 34));
        usersList.add(new ForumUser(895, "Luna", 'F', LocalDate.of(1985, 5, 8), 89));
        usersList.add(new ForumUser(774, "Jo", 'F', LocalDate.of(1989, 3, 19), 745));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}

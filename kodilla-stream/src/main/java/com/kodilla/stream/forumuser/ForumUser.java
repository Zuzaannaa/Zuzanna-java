package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Objects;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final LocalDate now = LocalDate.now();
    private final int postsCount;

    public ForumUser(final int id, final String userName, final char gender, final LocalDate dateOfBirth, final int postsCount) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postsCount = postsCount;
    }

    public final int calculateAge(){
        int age = Period.between(dateOfBirth, now).getYears();
        return age;

    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return  dateOfBirth;
    }

    public LocalDate getNow(){
        return now;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id &&
                gender == forumUser.gender &&
                postsCount == forumUser.postsCount &&
                userName.equals(forumUser.userName) &&
                dateOfBirth == forumUser.dateOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, gender, dateOfBirth, postsCount);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postsCount=" + postsCount +
                '}';
    }
}

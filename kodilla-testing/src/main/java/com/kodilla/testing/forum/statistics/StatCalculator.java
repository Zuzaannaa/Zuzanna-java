package com.kodilla.testing.forum.statistics;

public class StatCalculator {

    private int numberOfPosts;
    private int numberOfComments;
    private double postPerUser;
    private double commentPerUser;
    private double commentPerPost;
    private int numberOfUsers;

    Statistics statistics;

    public StatCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
    }

    public double calculatePostPerUser() {
        if ((numberOfPosts == 0 || numberOfUsers == 0)) {
            return 0;
        } else {
            return numberOfPosts / numberOfUsers;
        }
    }

    public double calculateCommentPerUser() {
        if ((numberOfComments == 0 || numberOfUsers == 0)) {
            return 0;
        } else {
            return numberOfComments / numberOfUsers;
        }
    }

    public double calculateCommentPerPosr() {
        if ((numberOfComments == 0 || numberOfPosts == 0)) {
            return 0;
        } else {
            return numberOfComments / numberOfPosts;
        }
    }


    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }

    public Statistics getStatistics() {
        return statistics;
    }
}

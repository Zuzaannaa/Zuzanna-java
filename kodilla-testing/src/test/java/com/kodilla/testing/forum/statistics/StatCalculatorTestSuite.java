package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatCalculatorTestSuite {

    @Test
    public void testNoPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        when(statsMock.postsCount()).thenReturn(0);
        StatCalculator statCalculator = new StatCalculator(statsMock);
        //When
        statCalculator.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(0, statCalculator.getNumberOfPosts());

    }

    @Test
    public void testThousandPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        when(statsMock.postsCount()).thenReturn(1000);
        StatCalculator statCalculator = new StatCalculator(statsMock);
        //When
        statCalculator.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(1000, statCalculator.getNumberOfPosts());
    }

    @Test
    public void testNoComments() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(0);
        StatCalculator statCalculator = new StatCalculator(statsMock);
        //Given
        statCalculator.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(0, statCalculator.getNumberOfComments());
    }

    @Test
    public void testCommentsGreaterThanPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(59);
        when(statsMock.postsCount()).thenReturn(27);
        StatCalculator statCalculator = new StatCalculator(statsMock);
        //When
        statCalculator.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertTrue(statCalculator.getNumberOfComments() > statCalculator.getNumberOfPosts());
    }

    @Test
    public void testHundredUsers() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 100; i < 100; i++) {
            users.add("Zuz");
        }
        when(statsMock.usersNames()).thenReturn(users);
        StatCalculator statCalculator = new StatCalculator(statsMock);
        //When
        statCalculator.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(users.size(), statsMock.usersNames().size());
    }

    @Test
    public void testNoUsers() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        when(statsMock.usersNames()).thenReturn(users);
        StatCalculator statCalculator = new StatCalculator(statsMock);
        //When
        statCalculator.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(users.size(), statsMock.usersNames().size());
    }
}

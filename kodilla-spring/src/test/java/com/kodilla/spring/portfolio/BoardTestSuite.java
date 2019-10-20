package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testBoard(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When
        boolean boardExists = context.containsBean("board");
        boolean toDoListExists = context.containsBean("toDoList");
        boolean inProgressExists = context.containsBean("inProgressList");
        boolean doneListExists = context.containsBean("toDoList");
        //Then
        System.out.println("Board in the container: " + boardExists);
        System.out.println("To Do List in the container: " + toDoListExists);
        System.out.println("In Progress List in the container: " + inProgressExists);
        System.out.println("Done List in the container: " + doneListExists);

    }

    @Test
    public void testAddToList(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("New Task");
        board.getInProgressList().getTasks().add("Task in Progress");
        board.getDoneList().getTasks().add("Done");
        //Then
        Assert.assertEquals("New Task" , board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Task in Progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Done", board.getDoneList().getTasks().get(0));

    }
}

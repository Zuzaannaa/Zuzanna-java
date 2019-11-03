package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "In Progress List";
    @Test
    public void findByListName(){
        //Given
        TaskList taskList = new TaskList(NAME, "Tasks to be done by Monday");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> nameOfTheList = taskListDao.findByListName(name);

        //Then
        Assert.assertEquals("In Progress List", nameOfTheList.get(0).getListName());

        //CleanUp
        int id = nameOfTheList.get(0).getId();
        taskListDao.deleteById(id);


    }
}

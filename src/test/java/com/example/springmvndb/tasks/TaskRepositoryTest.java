package com.example.springmvndb.tasks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;

@DataJpaTest
public class TaskRepositoryTest {
    @Autowired TasksRepository tasksRepository;
    @Test
    void can_create_new_test(){
        tasksRepository.save(new TaskEntity("This is a simple task",new Date(),true));
    }
    @Test
    void can_save_and_retrieve_task(){
        tasksRepository.save(new TaskEntity("This is a another task",new Date(),true));
        TaskEntity task=tasksRepository.findById(2L).get();
        assert task.getName().equals("This is a another task");
    }
}

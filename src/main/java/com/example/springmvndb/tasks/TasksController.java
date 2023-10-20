package com.example.springmvndb.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/tasks/")
public class TasksController {
    @Autowired TasksRepository tasksRepository;
    @PostMapping("/{name}")
    public ResponseEntity<TaskEntity> saveData(@PathVariable("name") String data)
    {
        TaskEntity task=new TaskEntity(data,new Date(),false);
        tasksRepository.save(task);
        return ResponseEntity.ok(task);
    }

}

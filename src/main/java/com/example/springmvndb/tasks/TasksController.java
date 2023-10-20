package com.example.springmvndb.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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
    @GetMapping("")
    public ResponseEntity<List<TaskEntity>> getTasks()
    {
        List<TaskEntity> list=tasksRepository.findAll();
        return ResponseEntity.ok(list);
    }
}

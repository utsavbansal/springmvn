package com.example.springmvndb.tasks;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService{
    private final TasksRepository tasksRepository;
    @Autowired
    public TaskServiceImpl(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @Override
    public List<TaskEntity> getAllTasks() {
        return tasksRepository.findAll();
    }

    @Override
    public TaskEntity getTaskById(Long id) {
        return tasksRepository.getById(id);
    }

    @Override
    public void addTask(TaskEntity task) {
        tasksRepository.save(task);
    }

    @Override
    public void updateTask(Long id, TaskEntity task) {
        task.setId(id);
        tasksRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        tasksRepository.deleteById(id);
    }
}

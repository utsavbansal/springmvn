package com.example.springmvndb.tasks;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    /**
     * Returns all tasks.
     * @return
     */
    List<TaskEntity> getAllTasks();

    /**
     * Returns task by id.
     * @param id
     * @return
     */
    TaskEntity getTaskById(Long id);

    /**
     * Create a new Task
     * @param task
     */
    void addTask(TaskEntity task);

    /**
     * Update task
     * @param task
     */
    void updateTask(Long id,TaskEntity task);

    /**
     * Delete task by id
     * @param id
     */
    void deleteTask(Long id);
}

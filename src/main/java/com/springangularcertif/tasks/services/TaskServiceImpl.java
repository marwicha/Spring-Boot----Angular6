package com.springangularcertif.tasks.services;

import com.springangularcertif.tasks.domain.Task;
import org.springframework.stereotype.Service;
import com.springangularcertif.tasks.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService
{

    private TaskRepository taskRepository ;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public Iterable<Task> listTasks() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {

        return this.taskRepository.save(task);
    }


}

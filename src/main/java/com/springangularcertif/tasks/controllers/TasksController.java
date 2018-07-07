package com.springangularcertif.tasks.controllers;


import com.springangularcertif.tasks.domain.Task;

import org.springframework.web.bind.annotation.*;
import com.springangularcertif.tasks.services.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TasksController {


    public TasksController(TaskService taskService) {
        this.taskService = taskService;
    }

    private TaskService taskService ;

    @GetMapping(value= {"" , "/" })

    public Iterable<Task> listTasks() {

        return taskService.listTasks() ;
    }

    @PostMapping("/save")

     public Task saveTask(@RequestBody Task task) {

         return this.taskService.saveTask(task) ;
        }


}

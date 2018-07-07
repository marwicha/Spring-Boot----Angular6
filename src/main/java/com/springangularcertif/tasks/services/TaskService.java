package com.springangularcertif.tasks.services;


import com.springangularcertif.tasks.domain.Task;



public interface TaskService {

    Iterable<Task> listTasks();

    Task saveTask(Task task);


}

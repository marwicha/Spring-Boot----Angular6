package com.springangularcertif.tasks.repositories;

import com.springangularcertif.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;


public interface TaskRepository extends CrudRepository<Task ,Long>{


}

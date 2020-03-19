package fr.cesi.ril19.javaproject.repositories;

import fr.cesi.ril19.javaproject.entities.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {

}

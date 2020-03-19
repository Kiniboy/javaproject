package fr.cesi.ril19.javaproject.services;

import fr.cesi.ril19.javaproject.entities.Task;
import fr.cesi.ril19.javaproject.repositories.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TaskService {

    TaskRepository tr;

    TaskService(TaskRepository tr) {
        this.tr = tr;
    }
        public List<Task> getTask() {
            return (List<Task>) this.tr.findAll();
        }
        public Task findTaskbyId(Long id) {
            return this.tr.findById(id).get();
        }
        public Task saveProject (Task t) {
            return this.tr.save(t);
        }
        public void deleteTaskById(@PathVariable Long id) {
            this.tr.deleteById(id);
        }
}

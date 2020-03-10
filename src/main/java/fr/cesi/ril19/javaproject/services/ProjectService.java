package fr.cesi.ril19.javaproject.services;


import fr.cesi.ril19.javaproject.entities.Project;
import fr.cesi.ril19.javaproject.repositories.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProjectService {
    ProjectRepository pr;

    ProjectService(ProjectRepository pr) {
        this.pr = pr;
    }
    public List<Project> getProject() {
        return (List<Project>) this.pr.findAll();
    }
    public Project findProjectbyId(Long id) {
        return this.pr.findById(id).get();
    }
    public Project saveProject (Project p) {
        return this.pr.save(p);
    }
    public void deleProjectById(@PathVariable Long id) {
        this.pr.deleteById(id);
    }




}

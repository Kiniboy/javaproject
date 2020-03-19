package fr.cesi.ril19.javaproject.services;


import fr.cesi.ril19.javaproject.entities.Project;
import fr.cesi.ril19.javaproject.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProjectService {
    ProjectRepository ProjectsRepo;

    @Autowired
    ProjectService(ProjectRepository ProjectsRepo) {

        this.ProjectsRepo = ProjectsRepo;
    }

    public List<Project> getProject() {
        return (List<Project>) this.ProjectsRepo.findAll();
    }
    public Project getProjectById(Long id) {
        return this.ProjectsRepo.findById(id).get();
    }

    public Project saveProject(Project u) {

        return this.ProjectsRepo.save(u);
    }

    public void deleteProjectById(@PathVariable Long id) {

        this.ProjectsRepo.delete(getProjectById(id));
    }
}

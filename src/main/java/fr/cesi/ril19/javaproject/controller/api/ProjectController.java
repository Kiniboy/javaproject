package fr.cesi.ril19.javaproject.controller.api;


import fr.cesi.ril19.javaproject.entities.Project;
import fr.cesi.ril19.javaproject.services.ProjectService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/project")
public class ProjectController {
    private ProjectService ps;

    // GET Project
    public List<Project> getProject() {
        return this.ps.getProject();
    }
}

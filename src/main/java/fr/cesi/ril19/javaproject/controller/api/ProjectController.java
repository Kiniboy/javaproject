package fr.cesi.ril19.javaproject.controller.api;

import fr.cesi.ril19.javaproject.entities.Project;
import fr.cesi.ril19.javaproject.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private ProjectService ProjectsService;

    @Autowired
    ProjectController(ProjectService ProjectsService) {

        this.ProjectsService = ProjectsService;
    }

    // GET Project
    @RequestMapping("")
    public List<Project> getProject() {

        return this.ProjectsService.getProject();
    }

    // GET Project BY ID
    @RequestMapping("/{id}")
    public Project getProjectById(@PathVariable("id") Long id) {

        return this.ProjectsService.getProjectById(id);
    }

    //POST Project
    @PostMapping("")
    public ResponseEntity<Project> postProject(@RequestBody Project u) {
        return new ResponseEntity<Project>(this.ProjectsService.saveProject(u), HttpStatus.CREATED);
    }

    //PUT Project
    @PutMapping("")
    public ResponseEntity<Project> saveProject(@RequestBody Project u) {
        return new ResponseEntity<Project>(this.ProjectsService.saveProject(u), HttpStatus.OK);
    }

    /*//PUT /Projects
    @PutMapping("/{id}/edit")
    public Project putProject(@RequestBody Project u) {
        return null;
    }*/

    // GET Project BY ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProjectById(@PathVariable("id") Long id) {
        this.ProjectsService.deleteProjectById(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
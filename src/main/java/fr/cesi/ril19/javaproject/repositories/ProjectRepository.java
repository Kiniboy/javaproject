package fr.cesi.ril19.javaproject.repositories;


import fr.cesi.ril19.javaproject.entities.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

}

package fr.cesi.ril19.javaproject.repositories;

import fr.cesi.ril19.javaproject.entities.User;
import fr.cesi.ril19.javaproject.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    /*List<Users> FindByName(String lastname);

    @Query(value="SELECT * FROM Users " +
            "WHERE firstname " +
            "LIKE %:word% " +
            "OR lastname LIKE %:word%", nativeQuery = true)
    List<Users> search(String word);*/

}

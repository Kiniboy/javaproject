package fr.cesi.ril19.javaproject.services;


import fr.cesi.ril19.javaproject.entities.User;
import fr.cesi.ril19.javaproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {
    UserRepository usersRepo;

    @Autowired
    UserService(UserRepository usersRepo) {

        this.usersRepo = usersRepo;
    }

    public List<User> getUser() {
        return (List<User>) this.usersRepo.findAll();
    }
    public User findUserById(Long id) {
        return this.usersRepo.findById(id).get();
    }
    public User saveUser(User u) {
        return this.usersRepo.save(u);
    }
    public void deleteUserById(@PathVariable Long id) {
        this.usersRepo.deleteById(id);}
}

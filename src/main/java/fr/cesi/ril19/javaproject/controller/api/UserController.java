package fr.cesi.ril19.javaproject.controller.api;

import fr.cesi.ril19.javaproject.entities.User;
import fr.cesi.ril19.javaproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService usersService;

    @Autowired
    UserController(UserService usersService) {

        this.usersService = usersService;
    }

    // GET User
    @RequestMapping("")
    public List<User> getUser() {

        return this.usersService.getUser();
    }

    // GET User BY ID
    @RequestMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {

        return this.usersService.getUserById(id);
    }

    //POST User
    @PostMapping("")
    public ResponseEntity<User> postUser(@RequestBody User u) {
        return new ResponseEntity<User>(this.usersService.saveUser(u), HttpStatus.CREATED);
    }

    //PUT User
    @PutMapping("")
    public ResponseEntity<User> saveUser(@RequestBody User u) {
        return new ResponseEntity<User>(this.usersService.saveUser(u), HttpStatus.OK);
    }

    /*//PUT /users
    @PutMapping("/{id}/edit")
    public User putUser(@RequestBody User u) {
        return null;
    }*/

    // GET User BY ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id") Long id) {
        this.usersService.deleteUserById(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
package controller;

import domain.User;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    private ArrayList<User> users = new ArrayList<User>();
    private HashMap<Long, User> userHashMap = new HashMap<Long, User>();

    @BeforeTransaction
    private void initTestData() {
    }

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return new User();
    }

    @RequestMapping("/allUsers")
    public List<User> getAllUsers() {
        return null;
    }


}

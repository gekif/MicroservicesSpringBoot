package com.gekif.learning.jpa.jpain10steps;

import com.gekif.learning.jpa.jpain10steps.entity.User;
import com.gekif.learning.jpa.jpain10steps.service.UserDAOService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            (Logger) LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long insert = userDAOService.insert(user);
        log.info("New User is create ; " + user);

    }
}

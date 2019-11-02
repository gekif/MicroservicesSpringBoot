package com.gekif.learning.jpa.jpain10steps;

import com.gekif.learning.jpa.jpain10steps.entity.User;
import com.gekif.learning.jpa.jpain10steps.service.UserDAOService;
import com.gekif.learning.jpa.jpain10steps.service.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            (Logger) LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    private final UserRepository userRepository;
    private final UserDAOService userDAOService;

    @Autowired
    public UserRepositoryCommandLineRunner(UserDAOService userDAOService, UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userDAOService = userDAOService;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("New User is create ; " + user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrieve: " + userWithIdOne);

        List<User> users = userRepository.findAll();
        log.info("All Users: " + users);

    }
}

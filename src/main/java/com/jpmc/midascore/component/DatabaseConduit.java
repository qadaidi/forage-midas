package com.jpmc.midascore.component;

import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DatabaseConduit {
    private final UserRepository userRepository;

    public DatabaseConduit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(UserRecord userRecord) {
        userRepository.save(userRecord);
    }

    public Optional<UserRecord> findUserByName(String name) {
        return userRepository.findByName(name);
    }

}

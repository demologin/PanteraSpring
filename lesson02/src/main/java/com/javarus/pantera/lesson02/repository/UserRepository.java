package com.javarus.pantera.lesson02.repository;

import com.javarus.pantera.lesson02.config.SessionCreator;
import com.javarus.pantera.lesson02.entity.User;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;


@Repository
@AllArgsConstructor
@ToString
public class UserRepository implements Repo {

    private final SessionCreator sessionCreator;

    public void save(User user) {
        System.out.println("Save user: " + user+"to DB impl");
    }
}

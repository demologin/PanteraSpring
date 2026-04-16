package com.javarus.pantera.lesson02.repository;

import com.javarus.pantera.lesson02.config.SessionCreator;
import com.javarus.pantera.lesson02.entity.User;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;


@Repository
@AllArgsConstructor
@ToString
public class OrderRepository implements Repo {

    private final SessionCreator sessionCreator;

}

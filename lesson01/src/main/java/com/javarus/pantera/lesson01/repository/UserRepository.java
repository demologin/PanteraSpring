package com.javarus.pantera.lesson01.repository;

import com.javarus.pantera.lesson01.config.SessionCreator;
import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class UserRepository {

    private final SessionCreator sessionCreator;
}

package com.javarus.pantera.lesson02;

import com.javarus.pantera.lesson02.config.Config;
import com.javarus.pantera.lesson02.entity.User;
import com.javarus.pantera.lesson02.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppLifeCycleDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean(UserService.class);
        List<User> users = List.of(
                User.builder().id(1L).name("admin").email("ok@gmail.com").password("qwertysdfsdf").build(),
                User.builder().id(1L).name("ok").email("ok@gmail.com").password("1fsdfsdfsd").build(),
                User.builder().id(1L).name("superman").email("okokokokok@gmail.com").password("adasfsdfsdfsdf").build(),
                User.builder().id(1L).name("guest").email("okerwer@gmail.com").password("wqw88erty").build()
                );
        userService.saveAll(users);
        System.out.println(userService);
    }
}

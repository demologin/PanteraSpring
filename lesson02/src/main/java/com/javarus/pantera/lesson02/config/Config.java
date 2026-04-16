package com.javarus.pantera.lesson02.config;

import com.javarus.pantera.lesson02.repository.UserRepository;
import com.javarus.pantera.lesson02.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import static com.javarus.pantera.lesson02.config.Config.BASE_PACKAGE;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(BASE_PACKAGE)
public class Config {

    public static final String BASE_PACKAGE = "com.javarus.pantera.lesson02";

    @Bean
    public SessionCreator getSessionCreator(ApplicationProperties applicationProperties) {
        return new SessionCreator(applicationProperties);
    }


}

package ru.task.cache.db1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class Db1Application {

    public static void main(String[] args) {
        SpringApplication.run(Db1Application.class, args);
    }

}

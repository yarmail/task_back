package task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Run {
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
        System.out.println("---------------");
        System.out.println("проект запущен");
        System.out.println("---------------");
        System.out.println("Go to http://localhost:8080/");
    }
}
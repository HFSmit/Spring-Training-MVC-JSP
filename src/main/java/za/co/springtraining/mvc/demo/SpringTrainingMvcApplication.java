package za.co.springtraining.mvc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTrainingMvcApplication {

    @Autowired
    private HomeController homeController;

    public static void main(String[] args) {
        SpringApplication.run(SpringTrainingMvcApplication.class, args);
    }

}

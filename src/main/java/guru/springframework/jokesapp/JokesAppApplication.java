package guru.springframework.jokesapp;

import guru.springframework.jokesapp.controllers.ChuckNorrisController;
import guru.springframework.jokesapp.services.ChuckNorrisService;
import guru.springframework.jokesapp.services.ChuckNorrisServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesAppApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(JokesAppApplication.class, args);

//        ChuckNorrisService chuckNorrisService = context.getBean("checkNorrisService", ChuckNorrisService.class);

//        ChuckNorrisService chuckNorrisService = new ChuckNorrisServiceImpl();
//
//        System.out.println(chuckNorrisService.getJoke());

//        ChuckNorrisController controller = new ChuckNorrisController();


    }


}

package guru.springframework.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesAppApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(JokesAppApplication.class, args);

//        ChuckNorrisService chuckNorrisService = context.getBean("chuckNorrisService", ChuckNorrisService.class);

//        ChuckNorrisService chuckNorrisService = new ChuckNorrisServiceImpl();
//
//        System.out.println(chuckNorrisService.getJoke());

//        ChuckNorrisController controller = new ChuckNorrisController();


    }


}

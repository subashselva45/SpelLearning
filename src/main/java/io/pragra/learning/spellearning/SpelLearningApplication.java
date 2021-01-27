package io.pragra.learning.spellearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class SpelLearningApplication {
  public static ApplicationContext context;
    public static void main(String[] args) {

        context=SpringApplication.run(SpelLearningApplication.class,args);
        Mood m = context.getBean("mood", Mood.class);
        System.out.println(m.getMood());
        m.display();
    }
    @GetMapping("/")
    public String getHomePage(){
       return context.getBean("page",String.class);
     //return "prod";
    }

}

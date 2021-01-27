package io.pragra.learning.spellearning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

//@Profile("dev")
@Configuration
@PropertySource("classpath:app.properties")
public class DevConfig {
//     @Bean(name="page")
//    public String pageName() {
//         return "index";
//     }
////
//   @Value("${page.name}")
//    private String page;
//
//   @Bean("page")
//    public String page(){
//       return page;
//   }
//
    @Value("#{${page.mood} > 50 ? 'prod':'index'}")
    private String page;
//    @Bean
//    public String page(){
//        return page;
//    }
    @Value("${student.name}")
   private String name;
   @Bean
   public String page(){
       System.out.println(name);
       return page;
   }
}

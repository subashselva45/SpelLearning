package io.pragra.learning.spellearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Profile({"prod","qa"})

public class ProdConfig {
    @Bean(name="page")
    public String pageName(){
        return "prod";
    }
}

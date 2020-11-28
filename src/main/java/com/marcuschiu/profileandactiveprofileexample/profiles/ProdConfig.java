package com.marcuschiu.profileandactiveprofileexample.profiles;

import com.marcuschiu.profileandactiveprofileexample.PojoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {

    @Bean
    public PojoBean pojoBean() {
        return new PojoBean("prod");
    }
}

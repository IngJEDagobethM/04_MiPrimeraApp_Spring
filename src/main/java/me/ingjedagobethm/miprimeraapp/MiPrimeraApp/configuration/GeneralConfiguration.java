package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.configuration;

import me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean.IMyBeanWithProperties;
import me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean.myBeanWithPropertiesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.lastname}")
    private String lastname;

    @Value("${value.random}")
    private String random;

    @Bean
    public IMyBeanWithProperties function(){
        return new myBeanWithPropertiesImplement(name, lastname);
    }
}

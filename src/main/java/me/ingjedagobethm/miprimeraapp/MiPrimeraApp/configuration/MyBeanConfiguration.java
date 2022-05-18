package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.configuration;

import me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfiguration {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement1();
    }

    @Bean
    public IMyOperation beanOperationOperation(){ return new MyOperationImplement(); }

    @Bean
    public IMyBeanWithDependency beanOperationOperationWithDependency(IMyOperation iMyOperation){
        return new MyBeanWithDependencyImplement(iMyOperation);
    }

    @Bean
    public IMyBeanChallengeGiveANumber beanChallengeGiveANumber(){
        return new MyBeanChallengeGiveANumberImplement();
    }

    @Bean
    public IMyBeanChallenge beanChallenge(IMyBeanChallengeGiveANumber iMyBeanChallengeGiveANumber){
        return new MyBeanChallengeImplement(iMyBeanChallengeGiveANumber);
    }
}

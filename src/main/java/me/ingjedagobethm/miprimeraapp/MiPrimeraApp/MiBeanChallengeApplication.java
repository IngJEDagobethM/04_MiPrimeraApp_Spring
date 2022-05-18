package me.ingjedagobethm.miprimeraapp.MiPrimeraApp;

import me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean.IMyBeanChallenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiBeanChallengeApplication implements CommandLineRunner {

    private IMyBeanChallenge iMyBeanChallenge;
    @Autowired
    public MiBeanChallengeApplication(IMyBeanChallenge iMyBeanChallenge) {
        this.iMyBeanChallenge = iMyBeanChallenge;
    }

    public static void main(String[] args) {
        SpringApplication.run(MiBeanChallengeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(iMyBeanChallenge.queSoy());
        iMyBeanChallenge.imprimeNumerosHasta();
    }
}

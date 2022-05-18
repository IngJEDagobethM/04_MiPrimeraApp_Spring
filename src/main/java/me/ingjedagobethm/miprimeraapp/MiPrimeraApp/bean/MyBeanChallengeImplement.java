package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanChallengeImplement implements IMyBeanChallenge{

    private int number = 0;
    private int tope = 0;

    private IMyBeanChallengeGiveANumber iMyBeanChallengeGiveANumber;
    @Autowired
    public MyBeanChallengeImplement(IMyBeanChallengeGiveANumber iMyBeanChallengeGiveANumber) {
        this.iMyBeanChallengeGiveANumber = iMyBeanChallengeGiveANumber;
        this.tope = 15;
        setNumber(this.tope);
    }

    public void setNumber(int t){
        this.number = iMyBeanChallengeGiveANumber.aNumber(t);
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public void imprimeNumerosHasta() {
        for(int i = 1; i <= this.getNumber(); i++){
            System.out.println(i);
        }
    }

    @Override
    public String queSoy() {
        return "Soy la implementación que imprime números hasta " + this.getNumber() + " inyectado aleatoriamente.";
    }
}

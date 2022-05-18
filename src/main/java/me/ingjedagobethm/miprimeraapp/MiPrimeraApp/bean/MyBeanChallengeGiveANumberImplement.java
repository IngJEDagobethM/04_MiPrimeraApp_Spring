package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean;

public class MyBeanChallengeGiveANumberImplement implements IMyBeanChallengeGiveANumber{
    @Override
    public int aNumber(int n) {
        return (int) (Math.random()*n);
    }
}

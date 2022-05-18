package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean;

public class MyOperationImplement implements IMyOperation{
    @Override
    public int sum(int number) {
        return ++number;
    }
}

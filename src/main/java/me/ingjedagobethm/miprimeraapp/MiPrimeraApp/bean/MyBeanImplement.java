package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Inyectando la implementación de mi propio Bean");
    }
}

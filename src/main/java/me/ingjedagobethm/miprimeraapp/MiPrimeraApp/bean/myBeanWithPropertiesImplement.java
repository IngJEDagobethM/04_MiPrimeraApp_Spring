package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean;

public class myBeanWithPropertiesImplement implements IMyBeanWithProperties{
    private String name;
    private String lastname;

    public myBeanWithPropertiesImplement(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String function() {
        return name + " " + lastname;
    }
}

package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean;

public class MyBeanWithDependencyImplement implements IMyBeanWithDependency{

    private IMyOperation myOperation;

    public MyBeanWithDependencyImplement(IMyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int number = 1;
        System.out.println(myOperation.sum(number));
        System.out.println("Esta es la implementación de un Bean con Dependencia.");
    }
}

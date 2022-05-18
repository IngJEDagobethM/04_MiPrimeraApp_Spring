package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements IComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Hola Mundo! Este es mi primer componente.");
    }
}

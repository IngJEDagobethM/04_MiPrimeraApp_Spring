package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement2 implements IComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Para elegir el componente a inyectar sobre varias implementaciones se usa la anotación @Qualifier.");
    }
}

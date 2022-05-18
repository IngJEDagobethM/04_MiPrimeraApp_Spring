package me.ingjedagobethm.miprimeraapp.MiPrimeraApp.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement1 implements IComponentDependency1 {

    @Override
    public void seguirSaludando() {
        System.out.println("Para tener dos componentes me toca crear dos interfaces diferentes.");
    }
}

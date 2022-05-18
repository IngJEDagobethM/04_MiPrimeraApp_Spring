package me.ingjedagobethm.miprimeraapp.MiPrimeraApp;

import me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean.IMyBeanWithDependency;
import me.ingjedagobethm.miprimeraapp.MiPrimeraApp.bean.MyBean;
import me.ingjedagobethm.miprimeraapp.MiPrimeraApp.component.IComponentDependency;
import me.ingjedagobethm.miprimeraapp.MiPrimeraApp.component.IComponentDependency1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiPrimeraAppApplication implements CommandLineRunner {
	// Inicia la inyección de dependencia
	// atributo de tipo Interfaz a Inyectar
	private IComponentDependency iComponentDependency;
	private IComponentDependency1 iComponentDependency1;
	private MyBean myBean;
	private IMyBeanWithDependency iMyBeanWithDependency;
	@Autowired // en versiones recientes no es obligatorio
	// constructor que inicializa el atributo
	// la anotación @Qualifier selecciona el bean primario a inyectar.
	public MiPrimeraAppApplication(@Qualifier("componentImplement2") IComponentDependency iComponentDependency,
								   IComponentDependency1 iComponentDependency1,
								   MyBean myBean,
								   IMyBeanWithDependency iMyBeanWithDependency){
		this.iComponentDependency = iComponentDependency;
		this.iComponentDependency1 = iComponentDependency1;
		this.myBean = myBean;
		this.iMyBeanWithDependency = iMyBeanWithDependency;
	}
	// Fin de la inyección de dependencia

	public static void main(String[] args) {
		SpringApplication.run(MiPrimeraAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iComponentDependency.saludar();
		iComponentDependency1.seguirSaludando();
		myBean.print();
		iMyBeanWithDependency.printWithDependency();
	}
}

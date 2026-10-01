
package co.edu.unicordoba.adapter.logistica_sin_patron;

import co.edu.unicordoba.adapter.logistica_sin_patron.controller.SinAdapterController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TallerAdapterLogisticaSinPatronApplication {

    public static void main(String[] args) {
        SpringApplication.run(TallerAdapterLogisticaSinPatronApplication.class, args);
    }

    /**
     * Ejecuta la versión sin patrón directamente en la consola al iniciar.
     */
    @Bean
    public CommandLineRunner run(SinAdapterController controller) {
        return args -> {
            System.out.println("\n--------------------------------------------------");
            System.out.println("EJECUCIÓN EN CONSOLA (VERSIÓN SIN ADAPTER - DEFECTO):");
            controller.ejecutarDemostracion().forEach(System.out::println);
            System.out.println("--------------------------------------------------\n");
        };
    }
}

package portail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "portail")  // Assurez-vous que c'est bien "portail"
public class IdentificationApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(IdentificationApplication.class, args);

        // Afficher tous les beans chargés
        System.out.println("📌 Liste des Beans chargés par Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}

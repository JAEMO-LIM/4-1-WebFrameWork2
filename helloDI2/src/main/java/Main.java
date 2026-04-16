import animal.PetOwner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PetOwner person = (PetOwner)  context.getBean("petOwner");

        person.play();
        context.close();
    }
}

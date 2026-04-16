import animal.AnimalType;
import animal.Cat;
import animal.Dog;
import animal.PetOwner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Dog dog() {
        Dog dog = new Dog();
        dog.setMyName("poodle");
        return dog;
    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setMyname("Naby");
        return cat;
    }

    @Bean
    public PetOwner petOwner() {
        return new PetOwner(cat());
    }
}

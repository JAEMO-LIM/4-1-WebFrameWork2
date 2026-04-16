package animal;

import lombok.Setter;

public class Dog implements AnimalType {

    @Setter
    String myName;

    @Override
    public void sound() {
        System.out.println(myName + " : " + "dog");
    }
}

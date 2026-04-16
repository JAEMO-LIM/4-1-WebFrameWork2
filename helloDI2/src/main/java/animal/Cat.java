package animal;

import lombok.Setter;

public class Cat implements AnimalType {
    @Setter
    private String myname;
    @Override
    public void sound() {
        System.out.println(myname + " : " + "Cat");
    }
}

package animal;

public class PetOwner {

    private AnimalType animalType;

    public PetOwner(AnimalType animalType) {
        this.animalType = animalType;
    }

    public void play() {
        animalType.sound();
    }
}

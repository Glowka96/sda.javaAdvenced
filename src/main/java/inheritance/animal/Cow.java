package inheritance.animal;
import inheritance.animal.interfaceAnimal.FarmAnimal;
import inheritance.animal.interfaceAnimal.LandCreatures;

public class Cow extends Animal implements FarmAnimal, LandCreatures{

    public Cow(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Eat banana");
    }

    @Override
    public void dataAnimal() {
        super.dataAnimal();
    }

    @Override
    public void makeSound() {
        System.out.println("uhaha");
    }

}

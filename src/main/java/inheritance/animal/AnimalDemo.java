package inheritance.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("Lucky" , 12, 65, "long");
        Whale whale = new Whale("Joki", 25, 25500, "Very big");
        Monkey monkey2 = new Monkey("Rosy" , 17, 65, "very long");
        Whale whale2 = new Whale("Torry", 29, 31500, "Very Very big");
        Monkey monkey3 = new Monkey("Grosy" , 12, 65, "small");
        Whale whale3 = new Whale("Zora", 22, 19612, "big");


        List<Animal> animals = new ArrayList<>();
        animals.add(monkey);
        animals.add(monkey2);
        animals.add(monkey3);
        animals.add(whale);
        animals.add(whale2);
        animals.add(whale3);

        AnimalGuide animalGuide = new AnimalGuide();
        animalGuide.guideAnimal(animals);




    }
}

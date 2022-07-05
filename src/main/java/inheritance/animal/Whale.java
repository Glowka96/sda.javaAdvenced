package inheritance.animal;

public class Whale extends Animal{
    private String size;
    public Whale(String name, int age, double weight, String size) {
        super(name, age, weight);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("Eat fish");
    }

    void dataAnimal() {
        super.dataAnimal();
        System.out.println(" " + getSize());
    }

    @Override
    public void makeSound() {
        System.out.println("plankton");
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "size=" + size +
                '}';
    }
}

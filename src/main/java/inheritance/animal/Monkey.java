package inheritance.animal;

public class Monkey extends Animal {
    private String haris;


    Monkey(String name, int age, double weight, String haris){
        super(name, age, weight);
        this.haris = haris;
    }

    @Override
    public void eat() {
        System.out.println("Eat banana");
    }

    @Override
    void dataAnimal() {
        super.dataAnimal();
        System.out.println(" " + getHaris());
    }

    public String getHaris() {
        return haris;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "size=" + haris +
                '}';
    }
}

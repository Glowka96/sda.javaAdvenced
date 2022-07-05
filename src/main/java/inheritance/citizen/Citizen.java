package inheritance.citizen;

public abstract class Citizen {
    private String name;
    Citizen(String name) {
        this.name = name;
    }

    abstract boolean canVote();

    public String getName() {
        return name;
    }
}



package inheritance.citizen;

public class Soldier extends Citizen{
    Soldier (String name) {
        super(name);

    }

    @Override
    boolean canVote() {
        return true;
    }
}

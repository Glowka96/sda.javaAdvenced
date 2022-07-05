package citizen;

public class Townsman extends Citizen{
    Townsman(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return true;
    }
}

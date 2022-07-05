package citizen;

public class Peasant extends Citizen{
    Peasant(String name){
        super(name);
    }

    @Override
    boolean canVote() {
        return false;
    }
}

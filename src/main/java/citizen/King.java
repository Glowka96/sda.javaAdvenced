package citizen;


public class King extends Citizen {
    King(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return false;
    }


}



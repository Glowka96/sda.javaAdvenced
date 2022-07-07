package object.task.dodgeGame;

public enum Movement {
    UP("W"), DOWN("S"), LEFT("A"), RIGHT("D");

    private String move;

    Movement(String move){
        this.move = move;
    }

    public String getMove() {
        return move;
    }
}

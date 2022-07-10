package object.task.dodgeGame;

public enum Choice {
    UP("W"), DOWN("S"), LEFT("A"), RIGHT("D");

    private String move;

    Choice(String move){
        this.move = move;
    }

    public String getMove() {
        return move;
    }
}

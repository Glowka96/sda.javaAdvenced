package object.task.hunterGame;

import java.util.Random;

public class Characters {
    int x;
    int y;
    private char aChar;

    public Characters(){}


    public Characters(char aChar) {
        Random random = new Random();
        this.x = random.nextInt(10);
        this.y = random.nextInt(10);
        this.setaChar(aChar);
    }

    protected boolean moveUp(){
        if (y < 9) {
            y++;
            return true;
        }
        return false;
    }
    protected boolean moveDown(){
        if( y > 0) {
            y--;
            return true;
        }
        return false;
    }
    protected boolean moveLeft(){
        if( x > 0 ){
            x--;
            return true;
        }
        return false;
    }
    protected boolean moveRight(){
        if( x < 9){
            x++;
            return true;
        }
        return false;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }
}

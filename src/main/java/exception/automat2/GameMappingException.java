package exception.automat2;

public class GameMappingException extends Exception{
    private String line;

    public GameMappingException(String message, String line){
        super(message);
        this.line = line;
    }
}

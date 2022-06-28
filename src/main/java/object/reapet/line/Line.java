package object.reapet.line;

public class Line {
    private int lengthLine;
    private String symbol;

    Line(int lengthLine, String symbol){
        this.lengthLine = lengthLine;
        this.symbol = symbol;
    }

    void printLine(){
        for (int i = 0; i < getLengthLine(); i++) {
            System.out.print(getSymbol());
        }
        System.out.println();
    }

    public int getLengthLine() {
        return lengthLine;
    }

    public void setLengthLine(int lengthLine) {
        this.lengthLine = lengthLine;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

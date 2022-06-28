package object.reapet.line;

import java.util.Random;

public class FactoryLine {
    private int length;

    Line createLineRandomLengthAndSymbolForUser(String symbol) {
        Random random = new Random();
        int rd = random.nextInt(10) + 1;
        return new Line(rd, symbol);
    }

    Line createLineLengthForUserAndSymbolRandom(int length) {
        Random random = new Random();
        char c = (char) random.nextInt();
        return new Line(length, c + "");
    }

    Line createLineRandomLengthAndSymbol() {
        Random random = new Random();
        int rd = random.nextInt(10) + 1;
        char c = (char) random.nextInt();
        return new Line(rd, c + "");
    }

    Line[] createLineArrayLengthForUser(int lengthArray) {
        Line[] lines = new Line[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            lines[i] = createLineRandomLengthAndSymbol();
        }
        return lines;
    }

    void printLineArray(Line[] lines) {
        for (Line line :
                lines) {
            line.printLine();
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    Line increasedTwoTimesTheLength() {
        Line line = new Line(2, "*");
        return new Line(getLength() * 2, line.getSymbol());
    }
}

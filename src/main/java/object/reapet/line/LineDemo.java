package object.reapet.line;

public class LineDemo {


    public static void main(String[] args) {

        FactoryLine factoryLine = new FactoryLine();
        Line line = new Line(5, "^");
        line.printLine();
        System.out.println();

        line = factoryLine.createLineRandomLengthAndSymbol();
        line.printLine();
        System.out.println();

        line = factoryLine.createLineLengthForUserAndSymbolRandom(20);
        line.printLine();
        System.out.println();

        line = factoryLine.createLineRandomLengthAndSymbolForUser("*");
        line.printLine();
        System.out.println();

        Line[] lines = factoryLine.createLineArrayLengthForUser(6);
        factoryLine.printLineArray(lines);
        System.out.println();


        line.printLine();
        line = factoryLine.increasedTwoTimesTheLength();
        line.printLine();
        line = factoryLine.increasedTwoTimesTheLength();
        line.printLine();
        line = factoryLine.increasedTwoTimesTheLength();
        line.printLine();
        line = factoryLine.increasedTwoTimesTheLength();
        line.printLine();
        line = factoryLine.increasedTwoTimesTheLength();
        line.printLine();
        line = factoryLine.increasedTwoTimesTheLength();
        line.printLine();

    }
}

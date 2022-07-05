package enums;

public enum Size {
    XXL(44), XL(42), L(40), M(38), S(36), XS(34), XXS(32);

    private int numericSize;

    Size(int numericSize) {
        this.numericSize = numericSize;
    }

    public int getNumericSize() {
        return numericSize;
    }

    public void setNumericSize(int numericSize) {
        this.numericSize = numericSize;
    }
}

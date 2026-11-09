package constant;

// Enum dai dien cho cac he co so duoc ho tro, moi he gan voi mot gia tri so hoc
public enum Base {
    DEC(10), HEX(16), BIN(2);
    private int base;

    private Base(int base) {
        this.base = base;
    }

    // Tra ve Base tuong ung voi gia tri so hoc (10, 16 hoac 2)
    public static Base getBase(int type) {
        // Dieu kien: xac dinh he co so dua tren gia tri truyen vao
        switch (type) {
            case 1:
                return DEC;
            case 2:
                return HEX;
            case 3:
                return BIN;
            default:
                throw new AssertionError();
        }
    }

    public int getValue() {
        return base;
    }

}

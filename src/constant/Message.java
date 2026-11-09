package constant;

public final class Message {

    private Message() {
        
    }
    

    // --- Prompts ---
    public static final String INPUT_BASE_MENU = "1 for Binary\n2 for Decimal\n3 for Hexadecimal\n"
            + "Enter choice: ";
    public static final String CONVERT_MENU = "1 for Binary\n2 for Decimal\n3 for Hexadecimal\n4 exit\n"
            + "Enter choice: ";

    public static final String ENTER_BIN = "Enter binary number: ";
    public static final String ENTER_DEC = "Enter decimal number: ";
    public static final String ENTER_HEX = "Enter hexadecimal number: ";
// --- Success Messages ---
    public static final String CONVERT_SUCCESS = "Number after convert: %s";

    // --- Error Messages ---
    public static final String ERROR_NO_DATA = "No input data available.";
    public static final String ERROR_INVALID_TARGET = "Invalid target base.";
    public static final String ERROR_INVALID_GENERAL = "Invalid imput value.";
    public static final String INTERGER_NUMBER_RANGE_ERROR = "Please input number in a range %d -> %d";
}

package lab72;

/**Defines the possible operation signs.*/
enum OperationSign {
    MULTIPLY("*"),
    DIVIDE("/"),
    MINUS("-"),
    PLUS("+"),
    ;

    private final String symbol;

    /**Constructor
     * @param symbol
     */
    OperationSign(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}

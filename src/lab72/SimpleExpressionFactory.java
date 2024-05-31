package lab72;

/**ConcreteFactory, handling the creation of constants and variables.*/
class SimpleExpressionFactory extends ExpressionFactory {

    /**Creates a simple expression by checks if the input is a constant or a variable
     * @param input
     * @return Variable or Constant element
     */
    @Override
    public Expression createExpression(String input) {
        if (input.matches("\\d+(\\.\\d+)?")) {
            return new Constant(Double.parseDouble(input));
        } else if (input.matches("[a-zA-Z]\\w*")) {
            return new Variable(input);
        }
        throw new IllegalArgumentException("Invalid simple expression: " + input);
    }
}

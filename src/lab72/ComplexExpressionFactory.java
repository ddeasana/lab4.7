package lab72;

/**ConcreteFactory, handling the creation of complex expressions and using SimpleExpressionFactory for its components.*/
class ComplexExpressionFactory extends ExpressionFactory {
    private final ExpressionFactory simpleFactory = new SimpleExpressionFactory();

    /**Makes expression, creating a different expression for every sign in input string
     * @param input
     * @return
     */
    @Override
    public Expression createExpression(String input) {
        // Parse the complex expression based on operation signs
        for (OperationSign sign : OperationSign.values()) {
            int index = input.lastIndexOf(sign.toString());
            if (index != -1) {
                Expression left = createExpression(input.substring(0, index).trim());
                Expression right = createExpression(input.substring(index + 1).trim());
                return new ComplexExpression(left, sign, right);
            }
        }
        return simpleFactory.createExpression(input);
    }
}

package lab72;

/** ConcreteProduct class, representing a complex expression combining other expressions.*/
class ComplexExpression extends Expression {
    private final Expression left;
    private final OperationSign sign;
    private final Expression right;

    /**Constructor with parameters
     * @param left
     * @param sign
     * @param right
     */
    public ComplexExpression(Expression left, OperationSign sign, Expression right) {
        this.left = left;
        this.sign = sign;
        this.right = right;
    }

    /**Prints the expression in parentheses
     */
    @Override
    public void print() {
        System.out.print("(");
        left.print();
        System.out.print(" " + sign + " ");
        right.print();
        System.out.print(")");
    }
}

package lab72;

/**Class for numerical variables, extends SimpleExpression.*/
class Constant extends SimpleExpression {
    private final double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

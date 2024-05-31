package lab72;

/**Class for text variables, extends SimpleExpression.*/
class Variable extends SimpleExpression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print(name);
    }
}

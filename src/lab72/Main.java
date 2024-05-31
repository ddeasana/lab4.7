package lab72;


public class Main {
    public static void main(String[] args) {
        ExpressionFactory factory = new ComplexExpressionFactory();

        Expression expression = factory.createExpression("3 * 2 - 5 + 1");
        expression.print();

    }
}

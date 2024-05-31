package lab72;

/**Abstract factory for creating expressions.*/
abstract class ExpressionFactory {
    public abstract Expression createExpression(String input);
}

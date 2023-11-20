package pij.day14.lab;

public class DivExpression extends BinaryExpression {

    public DivExpression(Expression left, Expression right) {
        super(left, right, "/");
    }

    @Override
    public int value() {
        return this.getLeft().value() / this.getRight().value();
    }
}

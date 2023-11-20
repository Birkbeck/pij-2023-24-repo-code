package pij.day14.lab;

/**
 * Represents an Expression of the form (e1 + e2).
 */
public class PlusExpression extends BinaryExpression {

    /**
     * Constructs a PlusExpression with left and right as direct
     * subexpressions.
     *
     * @param left the left subexpression
     * @param right the right subexpression
     * @throws NullPointerException if left or right is null
     */
    public PlusExpression(Expression left, Expression right) {
        super(left, right, "+");
    }

    /**
     * @return the sum of the values of the direct subexpressions
     */
    @Override
    public int value() {
        return this.getLeft().value() + this.getRight().value();
    }
/*
    @Override
    public String toString() {
        return "(" + this.getLeft().toString() + " + " + this.getRight().toString() + ")";
    }

 */
}

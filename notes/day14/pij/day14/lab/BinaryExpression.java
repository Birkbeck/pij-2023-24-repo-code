package pij.day14.lab;

/**
 * Abstract class for Expressions with two direct subexpressions.
 * Provides an implementation for numberOfNodes() method.
 */
public abstract class BinaryExpression implements Expression {

    private static final String OPENING_PARENTHESIS = "(";
    private static final String CLOSING_PARENTHESIS = ")";

    /** the left subexpression; non-null */
    private final Expression left;

    /** the right subexpression; non-null */
    private final Expression right;

    /** the operator symbol; non-null */
    private final String operatorSymbol;

    /**
     * Constructs a BinaryExpression with left and right as direct
     * subexpressions.
     *
     * @param left the left subexpression
     * @param right the right subexpression
     * @throws NullPointerException if left or right is null
     */
    public BinaryExpression(Expression left, Expression right, String operatorSymbol) {
        if (left == null) {
            throw new NullPointerException("Illegal null Expression!");
        }
        if (right == null) {
            throw new NullPointerException("Illegal null Expression!");
        }
        if (operatorSymbol == null) {
            throw new NullPointerException("Illegal null argument!");
        }
        this.left = left;
        this.right = right;
        this.operatorSymbol = operatorSymbol;
    }

    /**
     * Getter for the left subexpression.
     *
     * @return the left subexpression
     */
    public Expression getLeft() {
        return this.left;
    }

    /**
     * Getter for the right subexpression.
     *
     * @return the right subexpression
     */
    public Expression getRight() {
        return this.right;
    }

    /**
     * The number of nodes of a BinaryExpression is 1 plus the number of
     * nodes of the left subexpression and of the right subexpression.
     *
     * @return the number of nodes of this expression
     */
    @Override
    public int numberOfNodes() {
        return 1 + this.left.numberOfNodes() + this.right.numberOfNodes();
    }

    @Override
    public String toString() {
        return OPENING_PARENTHESIS + this.left + " " + this.operatorSymbol
                                   + " " + this.right + CLOSING_PARENTHESIS;
    }
}

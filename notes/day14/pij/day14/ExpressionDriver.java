package pij.day14;

public class ExpressionDriver {
    public static void main(String[] args) {
        Expression intExp1 = new IntConstant(9);
        Expression intExp2 = new IntConstant(3);
        Expression intExp3 = new IntConstant(6);
        Expression plusExp = new PlusExpression(intExp1, intExp2);
        Expression timesExp = new TimesExpression(plusExp, intExp3);
        System.out.println("((9 + 3) * 6) = " + timesExp.value());
        System.out.println("((9 + 3) * 6) has " + timesExp.numberOfNodes() + " nodes");
    }

}

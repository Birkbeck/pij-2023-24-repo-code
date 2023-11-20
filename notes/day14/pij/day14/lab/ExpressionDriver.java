package pij.day14.lab;

public class ExpressionDriver {
    public static void main(String[] args) {
        Expression intExp1 = new IntConstant(9);
        Expression intExp2 = new IntConstant(3);
        Expression intExp3 = new IntConstant(6);
        Expression intExp0 = new IntConstant(0);

        Expression plusExp = new PlusExpression(intExp1, intExp2);
        Expression timesExp = new TimesExpression(plusExp, intExp3);
        System.out.println("((9 + 3) * 6) = " + timesExp.value());
        System.out.println("((9 + 3) * 6) has " + timesExp.numberOfNodes() + " nodes");

        System.out.println(intExp1.toString());
        System.out.println(plusExp.toString());
        System.out.println(timesExp.toString());

        Expression divExp = new DivExpression(timesExp, intExp0);
        System.out.println(divExp);
        System.out.println(divExp.value());
        System.out.println(divExp.numberOfNodes());
    }

}

// Author: Piyush Kant
// Id: C0893688
public class Main {
    public static void main(String[] args) {
        Number n1 = new Number(2);
        Number n2 = new Number(5);
        Number n3 = new Number(3);

        ArithmeticExpression exp = new Sum(n1, new Product(n2,n3));
        System.out.println(exp.evaluate());
        System.out.println(exp.toString());

        ArithmeticExpression exp2 = new Modulo(new Number(9),new Number(4));
        System.out.println(exp2.toString());
        System.out.println(exp2.evaluate());
    }
}

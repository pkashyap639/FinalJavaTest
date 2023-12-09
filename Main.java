public class Main {
    public static void main(String[] args) {
        Number n1 = new Number(2);
        Number n2 = new Number(5);
        Number n3 = new Number(3);

        ArithmeticExpression exp = new Sum(n1, new Product(n2,n3));
        System.out.println(exp.evaluate());
        System.out.println(exp.toString());
    }
}

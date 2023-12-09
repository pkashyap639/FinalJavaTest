public class Product extends Binary{
    public Product(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(){
        return getLeft().evaluate()* getRight().evaluate();
    }

    @Override
    public String toString() {
        return getLeft().toString()+" * "+getRight().toString();
    }
}

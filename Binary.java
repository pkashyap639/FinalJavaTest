public class Binary extends ArithmeticExpression{
    private ArithmeticExpression left;
    private ArithmeticExpression right;

    public Binary(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }

    public ArithmeticExpression getLeft() {
        return left;
    }

    public void setLeft(ArithmeticExpression left) {
        this.left = left;
    }

    public ArithmeticExpression getRight() {
        return right;
    }

    public void setRight(ArithmeticExpression right) {
        this.right = right;
    }

    @Override
    public int evaluate() {

        return 0;
    }

}

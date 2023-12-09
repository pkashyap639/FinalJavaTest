import java.awt.*;

public class Sum extends Binary{
    public Sum(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(){
        return getLeft().evaluate()+ getRight().evaluate();
    }

    @Override
    public String toString() {
        return getLeft().toString()+" + "+getRight().toString();
    }
}

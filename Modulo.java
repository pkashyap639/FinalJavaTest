public class Modulo extends Binary{
    public Modulo(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(){
        int left = getLeft().evaluate();
        int right = getRight().evaluate();
        try{
            return left % right;
        }catch(Exception e){
            System.out.println("Divisible by 0 Exception");
        }
        return 0;
    }

    @Override
    public String toString() {
        return getLeft().toString()+" % "+getRight().toString();
    }
}

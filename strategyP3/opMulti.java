package strategyP3;

public class opMulti implements Strategy{
    @Override
    public void doOp(int num, int num2) {
        System.out.println(num * num2);
    }
}

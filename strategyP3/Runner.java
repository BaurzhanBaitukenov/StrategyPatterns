package strategyP3;

public class Runner {
    public static void main(String[] args) {
        Strategy add = new opAdd();
        Strategy sub = new opSub();
        Strategy multi = new opMulti();

        add.doOp(5, 2);
        sub.doOp(10 ,2);
        multi.doOp(10, 5);
    }
}

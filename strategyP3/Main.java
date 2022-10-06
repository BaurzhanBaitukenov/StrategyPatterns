package strategyP3;

public class Main {
    public static void main(String[] args) {
        StrategyClient str = new StrategyClient();

        int[] arr = {2,4,56,7,7,8,4,2};

        str.setStr(new BubbleSort());
        str.executeStr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

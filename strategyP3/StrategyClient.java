package strategyP3;

public class StrategyClient {
    Sorting str;

    public void setStr(Sorting str){
        this.str = str;
    }

    public void executeStr(int[] arr){
        str.sort(arr);
    }
}

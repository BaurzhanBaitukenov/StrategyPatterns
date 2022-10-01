package strategyP2;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Train());
        developer.executeActivity();
    }
}

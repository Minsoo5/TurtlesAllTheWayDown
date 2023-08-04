import java.time.Duration;
import java.time.Instant;

public class main {
    public static void main(String[] args) {

        Instant start = Instant.now();
        GCD.findGCD();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();



    }
}

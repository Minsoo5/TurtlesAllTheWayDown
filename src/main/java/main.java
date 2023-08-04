import java.time.Duration;
import java.time.Instant;

public class main {
    public static void main(String[] args) {

        Instant start1 = Instant.now();
        GCD.findGCD(180, 378);
        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toNanos();

        Instant start2 = Instant.now();
        GCD2.findGCD2(180, 378);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toNanos();

        System.out.println("Recursion Time:       " + timeElapsed1);
        System.out.println("Non-Recustion Time:   " + timeElapsed2);


    }
}

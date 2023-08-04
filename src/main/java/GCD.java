public class GCD {

    public static int findGCD(int x, int y) {
        if (y == 0) return x;
        else return findGCD(y, x % y);
    }

    //3 12

    //12 (3 % 12)
}

package piCalc;

public class singleThread {
    public static void main(String[] args) {

        int n = 10_000_000;
        double piValue = calculatePi(n);
        System.out.println(piValue);
    }

    private static double calculatePi(double n) {

        double pi = 0;
        for (int i = 1; i < n; i++) {
            pi += Math.pow(-1,i+1) / (2*i - 1);
        }
        return 4 * pi;
    }


}

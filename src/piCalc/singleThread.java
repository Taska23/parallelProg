package piCalc;

public class singleThread {

    public static double calc(double n) {

        double pi = 0;
        for (int i = 1; i < n; i++) {
            pi += Math.pow(-1,i+1) / (2*i - 1);
        }
        return 4 * pi;
    }


}

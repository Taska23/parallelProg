package piCalc;

public class omp4j {
    public static double calc(int n) {



        int i;
        double w, x, sum, pi;

        /* calculate the interval size */
        w = 1.0;
        sum = 0.0;
        // omp parallel for schedule(dynamic)
        for (i = 1; i <= n; i++) {
            // omp parallel threadNum(8)
            x = w * (i - 0.5);
            sum = sum + f(x);
        }
        pi = w * sum;
        /*
        System.out.println("Computed Pi: " + pi);
        */
        return pi;
    }

    /* function to integrate */
    static double f(double a) {
        return (2.0 / (1.0 + a * a));
    }
}
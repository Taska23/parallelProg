package piCalc;

public class calcComparator {
    public static void main(String[] args) {

        int n = 10_000_000;

        long start;
        long finish;
        long timeConsumedMillis;

        System.out.println("Starting single - thread java core Pi calculating");
        start = System.currentTimeMillis();
        System.out.println(singleThread.calc(n));
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("finished, time consumed: " + timeConsumedMillis + " ms");


        System.out.println("Starting multi - thread java core Pi calculating");
        start = System.currentTimeMillis();
        try {
            System.out.println(multiThread.calc(n));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("finished, time consumed: " + timeConsumedMillis + " ms");


        System.out.println("Starting multithread MPI (mpj express) Pi calculating");
        start = System.currentTimeMillis();
        System.out.println(singleThread.calc(n));
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("finished, time consumed: " + timeConsumedMillis + " ms");


        System.out.println("Starting multithread openmp (omp4j) Pi calculating");
        start = System.currentTimeMillis();
        System.out.println(omp4j.calc(n));
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("finished, time consumed: " + timeConsumedMillis + " ms");


    }
}

public class PrimeFactorsExercise {
    public static void generatePrimeFactors(int N) {
        for (int i = 2; i <= N; i++) {
            while (N != i) {
                if (N % i == 0) {
                    System.out.println(i);
                    N = N / i;
                } else break;
            }
        }
        System.out.println(N);
    }
}

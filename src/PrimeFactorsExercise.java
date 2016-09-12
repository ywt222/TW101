public class PrimeFactorsExercise {
    public void generatePrimeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n != i) {
                if (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                } else {
                    break;
                }
            }
        }
        System.out.println(n);
    }
}


class SieveOfAtkins {

    public static void main(String[] args) {
        int limit = 100;
        sieveOfAtkins(limit);
    }

    private static void sieveOfAtkins(int limit) {
        if (limit > 2) {
            System.out.println(2 + " ");
        }

        if (limit > 3) {
            System.out.println(3 + " ");
        }

        boolean sieve[] = new boolean[limit + 1];

        for (int i = 0; i <= limit; i++) {
            sieve[i] = false;
        }

        for (int x = 1; Math.pow(x, 2) <= limit; x++) {
            for (int y = 1; Math.pow(y, 2) <= limit; y++) {

                int n = (int) (4 * (Math.pow(x, 2)) + (Math.pow(y, 2)));
                if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
                    sieve[n] ^= true;
                }

                n = (int) (3 * (Math.pow(x, 2)) + Math.pow(y, 2));
                if (n <= limit && n % 12 == 7) {
                    sieve[n] ^= true;
                }

                n = (int) (3 * (Math.pow(x, 2)) - Math.pow(y, 2));
                if (n <= limit && x > y && n % 12 == 11) {
                    sieve[n] ^= true;
                }

            }

        }

        for (int r = 5; Math.pow(r, 2) <= limit; r++) {
            if (sieve[r]) {
                for (int i = (int) Math.pow(r, 2); i <= limit; i += Math.pow(r, 2)) {
                    sieve[i] = false;
                }
            }
        }
        for (int a = 5; a <= limit; a++) {
            if (sieve[a]) {
                System.out.println(a);
            }
        }
    }
}

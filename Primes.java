public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        
        boolean[] Prime = new boolean[n + 1];
        for (int i = 2; i < Prime.length; i++) {
            Prime[i] = true;
        }
        
        int p = 2;
        while (p <= Math.sqrt(n)) {
            if (Prime[p] == true) {
                int i = p + p;
                while (i <= n) {
                    Prime[i] = false; 
                    i = i + p;        
                }
            }
            
            p++; 
        }
        int count = 0; 
        
        for (int i = 2; i <= n; i++) {
            if (Prime[i] == true) {
                System.out.println(i); 
                count++; 
            }
        }
        double percentage = ((double) count / n) * 100;
        
        System.out.println("There are " + count + " primes between 2 and " + n + 
                           " (" + (int)percentage + "% are primes)");
    }
}
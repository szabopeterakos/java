package HR_OOP;

public class Prime {
    static void checkPrime(int... nums) {
        for (int n : nums) {
            int c = 0;
            if(n == 1 || n == 2){
                System.out.println("YES");
            }else {
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        c++;
                    }
                }
                if (c == 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static void main(String[] args) {
        checkPrime( 1,2,3,4,13,31,32);
    }
}

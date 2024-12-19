

public class p2_Fibbo {
    public static void main(String[] args) {
        System.out.println(fibbo(20 ));
    }

    static int fibbo(int n){
        // base case
            if(n == 0) return 0;
            if(n == 1) return 1;

        // induction
            return fibbo(n-1) + fibbo(n-2);
    }
}

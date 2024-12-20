public class p4_Nto1 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
    // base case
        if(n == 1) return;

    // induction
        System.out.println(n);
        print(n-1);
    }
}



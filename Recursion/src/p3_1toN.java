

public class p3_1toN {
    public static void main(String[] args) {
        print(7);
    }

    // pass the no and print the values from one to n
    static void print(int n){
    // base case
        if(n == 0) return;


    // induction //
        print(n-1);
        System.out.println(n);
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(xxx(3));
    }

    static int c = 0;

    public static int xxx(int n){
        // bas case
        if(n == 0) return 0;

        // inductino
        c = xxx(n-1) + n;
        return c;
    }

}


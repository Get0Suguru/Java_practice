import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        // look null means nothing there

        /* rem 3 things
            1. u can't give null to a primitive type as they store directly || only can do it with the reference type as they have to store the address
            2. why its useful -- as it protects ur program to crash ( u know this could be null u could add somethin in mid to deal with it or display it) - instead of crash
            3. nullPointerException -- REM u can't perform a method on something that is null (coz the thing u gonna play with is nothing vaccume so nullp Exception)  Moral-don't do that
         */

        // 1
//         int x = null;
            String x = null;        // x - i have address  ( wait but there is nothing there ;(
            int[] y  = null;

        // 2
         if(x == null){
             System.out.println("can't run the program as x is null");
         }

         // 3
        int zx = y.length;
         // exception baby
        // thats what we said don't do it there is nothing to play with at this address

    }

}
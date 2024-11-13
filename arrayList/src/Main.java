

// something like ultimate array
// it have a bunch of cool functionality that will make the difference

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] normalArr = {"apple" , "mango", "banana", "blackberry" };
        System.out.println(normalArr[0]);
        System.out.println(normalArr);

        // here goes the ultimate array

        // its not like assigning an array to it            // u can only add or remove by methods //
        ArrayList ultimateArr = new ArrayList();                           // ["apple", "mango", "banana"]

        ultimateArr.add("apple");
        ultimateArr.add("mango");
        ultimateArr.add("bhokachoda");
        ultimateArr.add(4);
        System.out.println(ultimateArr);

        ultimateArr.remove("bhokachoda");
        ultimateArr.add(2, "banana");
        System.out.println(ultimateArr);

        ultimateArr.remove(Integer.valueOf(4));         // jugar u can do as it is not getting 4 it as obj and there is no way to trigger o parameter (this remove method is overloaded with obj or index)
        if(ultimateArr.contains(4)){

        }
        System.out.println(ultimateArr);


    }
}
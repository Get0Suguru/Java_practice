import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // first exception i am gonna try out is try to get something at wrong index in array
        // then we will talk about the exception we got

//        String[] arr1 = new String[3];
//          String[] arr1 = {"apple", "mango", "banana"};
//        System.out.println(arr1[3]);        // which actually doesn't exist

        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	    at Main.main(Main.java:10)
	   '                           '
	    exception is in the main block

	                                '        '
	                                name of the class where all those exceptions are defined

	                                          '                             '
	                                          name of the exception that u got

	                                                                         '                                  '
	                                                                         why u got and the quick fix to ur excp

            '                       '
            where is the exception found in your code
            Main.main
            class.method
                                10 - the line after which we got the exception
                                        that does not mean that line is wrong in all case okkay - REM just
         */


        // 2nd one
//        int i = "gola";         // String in int type
//        System.out.println(i);

        // its an error as our ide can't force run




        // 3rd      same like we did the first one but with arraylist
//        ArrayList<String> myList = new ArrayList<String>();
//
//        System.out.println(myList.get(0));                                        // as we all know anything except creating an array list(empty of filled) could only be done by methods

        // exception said
        // first - exception came from the main method
        // 2nd - class where errors are.  name of the exception
        // 3rd - after: we got the why we got it and the quick fix to it
        // 4th - it goes inside where it all defined and said somethin went wrong that goes to another file
        // 5th
        // 6th - where it all started    after exicuting line 48 we got this oh yeah



        // 4th next candidate is nullpointer exception ( happen when we try to get something and got null there
//        int x = null;     didn't make it
        ArrayList<Integer> arrL = null;
        arrL.get(0);
        // nullpointer sais the thing u r trying to get and do stuff with it is not there //
        // run - look at this juicy null pointer exception
    }
}
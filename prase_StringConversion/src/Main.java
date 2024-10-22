
// Need - as the user input is always string in gui
// but to operate we have to convert in no


// rem 1 - parse is for String to no conversion
// rem 2 - parse is a method defined in the class of that no(variable) type
        // ex- String to double - so parse method is in the Double class got it

public class Main {
    public static void main(String[] args) {

        String test = "4";
        int x = Integer.parseInt(test);
        System.out.println(x);

        double y = Double.parseDouble(test);
        System.out.println(y);
    }
}
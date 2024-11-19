import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> passMan = new HashMap<String, String>();
        passMan.put("gopa@gmail.com", "12345qwe");
        passMan.put("gola@gmail.com", "1234qwer");
        passMan.put("mola@gmail.com", "qwer1234");

        // remove an  element (only key)
        passMan.remove("gola@gmail.com");
        System.out.println(passMan);

        // contains value and key method
        if (passMan.containsValue("qw23er1234")) {
            if (passMan.containsKey("mola@gmail.com")) {
                System.out.println("fuck you all of them are true");
            }
        }

        // size method
        System.out.println(passMan.size());

        // replace someone's value

        passMan.replace("mola@gmail.com", "asdfjkl;");
        System.out.println(passMan);

        passMan.values();       // will give all the values
        passMan.keySet();       // will give all the keys

        passMan.put("lola@gmail.com", "uiop7890");
        System.out.println(passMan);
    }
}
public class Main {
    public static void main(String[] args) {
        TextField textBox1 = new TextField();
        textBox1.text = "papa";

/*

//  textBox1.text = "box 1";                     as its public which has not to be  or

        textBox1.setText("bhosda 1");
        System.out.println(textBox1.text);

//  a gud practice as java is static

        var textBox2 = new TextField();         //java autodetect not dynamic (still static)
        textBox2.setText("bhosda 2");
        System.out.println(textBox2.text);

        textBox2.clearText();
        System.out.println(textBox2.text);

 */


//  clearing confusion about primitive and reference variables  (side by side)

    var textBox3 = textBox1;
        System.out.println("t1 before manipulation in t3: " + textBox1.text);

    textBox3.setText("bhosda hogya");
        System.out.println("t1 after manipulation in t3: " + textBox1.text);

        System.out.println("address of t3: " + textBox3);
        System.out.println("address of t1: " + textBox1);

        // if they are actually address they must print the same address am I right actually they print heap code which is computer generate not stored somewhere
        // (but the generation of heap code involves the address of the object) mostly it refers same address


//  the primitive ones  (side by side)

    int  x = 20;            // working like the textBox 1
    int y = x;
        System.out.println("x before manipulation in y: " + x);

        y = 10;
        System.out.println("x after manuplation in y: " + x);

//  shows that the primitive ones have actually values in them not like the reference who have the address in stack


//  now if the theory says that object is inside the heap without any name just the address and
//  the name is actually inside stack having the address not the actual value/data sounds strange hmm

//  and that's not the case with primitive they are stored in the stack with their actual value

    }
}
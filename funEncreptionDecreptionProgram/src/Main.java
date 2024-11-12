
// there are a million enc decryption methods out there each with their no of process and key
// lets make a simple one

public class Main {
    public static void main(String[] args) {
//        String mssg = "hey i don't wanna continue as a college student but don't tell it to my father";
//        int key = 8;
//
//        // for encryption
//        char[] cArray = mssg.toCharArray();
//        for(char c:cArray){
//            c += 8;
//            System.out.print(c);
//
//        }

        // for decryption
        String encryptedMsg = "pm\u0081(q(lwv/|(\u007Fivvi(kwv|qv}m(i{(i(kwttmom({|}lmv|(j}|(lwv/|(|mtt(q|(|w(u\u0081(ni|pmz";
        char[] cEncrArray = encryptedMsg.toCharArray();
        for(char c:cEncrArray){
            c -= 8; // pass the key chillin
            System.out.print(c);
        }

    }
}
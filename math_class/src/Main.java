

public class Main{
    public static void main(String[] args) {

// math class gives u some extra features like

    // roundOff
        long x = Math.round(2.23);               // in case of double as argument returns the closest long
        int y = Math.round(2.2f);                // in case of float as argument return the closest int

    // ceil - gives the greater and close int       rem- ceil return double
        double z = Math.ceil(2.3);

    // floor - give the smaller and closer int as double
        double a = Math.floor(2.3);

    // min, max - just gives u min max from the argument u pass

    // random - return type(double) && ranges from 0-1

        int r = (int)(Math.random() * 100);
        System.out.println(r);
    }
}
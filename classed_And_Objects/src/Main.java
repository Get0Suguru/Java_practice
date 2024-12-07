

public class Main {
    public static void main(String[] args) {
        // 1. class is a blueprint of data and method         class hava data and member functions
        // 2. this keyword tell which object is using so its gives data based on that object

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
        pen1.flexing();

        Pen pen2 = new Pen();
        pen2.type = "ball";

        pen2.write();

    }
}


public class Pen {
    String color;           // 3.  if nothing u give it'll store null
    String type;
    public class Loda{

    }

    public void write() {
        System.out.println("writing in color " + this.color);        // 2. that this will give color based on the object
    }

    public void flexing(){
        System.out.println("i have a " + this.type + "pen");
    }

    // 4. different kind of constructors - the empty, one with paramets (and ask for arguements) , copy constructor
}

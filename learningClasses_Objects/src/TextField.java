
public class TextField {
    // making a field in my class
    public String text;

    // making a method to write text to the field(text)
    public void setText(String text) {
    this.text = text;           // here this represents the current class inside which we are doing modifications
    }

    public void clearText(){
        text = "i m empty";              // why not this.text this time - as the parameter & the field are not making confusion like past they have same name
    }
}

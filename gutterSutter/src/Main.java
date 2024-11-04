import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        // just for the sake


        var employee1 = new Employee(30_000, 100);
        var emp2 = new Employee(50_000, 10_000);

        int e1Wage = employee1.wage(50);
        int e1Wage2ndMonth = employee1.wage();
        System.out.println(e1Wage);
        System.out.println(emp2.wage(80));

        Employee.calNoOfEmployee();

        // the second month company decides to not pay the extra hours and pay them later just give them the base salary
    }
}
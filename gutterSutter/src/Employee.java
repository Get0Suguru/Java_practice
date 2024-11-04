    // papa class //
public class Employee  {

    private int base_salary;
    private int extra_hours;
    public int hourly_rate;                                 // just for the sake of point 8 in p1 on notebook (do we make obj or not of a class)
    public static int noOfEmployees = 0;                    // static field

    public Employee(int baseSalary, int extraHours) {
        setBase_salary(baseSalary);
        setExtra_hours(extraHours);
        noOfEmployees++;
    }

    // as the part of abstraction I am making them private to dec the complexity

    private int getBase_salary() {
        return base_salary;
    }

    private int getExtra_hours() {
        return extra_hours;
    }

    private int getHourly_rate() {
        return hourly_rate;
    }

    private void setBase_salary(int base_salary) {
        if (base_salary <= 0) throw new IllegalArgumentException("base salary can't be 0 or negative");
        this.base_salary = base_salary;
    }

    private void setExtra_hours(int extraHours) {
        if (extraHours <= 0) throw new IllegalArgumentException("extra hours can't be zero or negative");
        this.extra_hours = extraHours;
    }

    // static method
    public static void calNoOfEmployee(){
        System.out.println(noOfEmployees);
        // here i can't use any kind of non-static shit of the papa class
    }

    // method overloading
    public int wage(int hourly_rate) {
        return (base_salary + extra_hours * hourly_rate);
    }

    public int wage() {
        return (wage(0));
    }


}



public class Employee {
    private int employeeid;
    private String name;
    private double hoursworked;
    private double Payrate;

    public Employee(int employeeid, String name, double hoursworked, double payrate) {
        this.employeeid = employeeid;
        this.name = name;
        this.hoursworked = hoursworked;
        this.Payrate = payrate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public double getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(double hoursworked) {
        this.hoursworked = hoursworked;
    }

    public double getPayrate() {
        return Payrate;
    }

    public void setPayrate(double payrate) {
        this.Payrate = payrate;
    }

    public double getGrosspay(){
        return Payrate * hoursworked;



}

}

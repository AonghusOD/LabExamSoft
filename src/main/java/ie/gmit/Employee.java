package ie.gmit;

public class Employee {
    String name;
    int EmployNum;

    public Employee(){
        this.name = "Aonghus";
        this.EmployNum = 123;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployNum() {
        return EmployNum;
    }

    public void setEmployNum(int employNum) {
        EmployNum = employNum;
    }

    public Employee(String name, int employNum) {
        this.name = name;
        EmployNum = employNum;
    }
}

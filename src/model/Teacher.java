package model;

public class Teacher extends Human{
    private int salary;
    private Status status;
    public Teacher(String firstName, String lastName, int age, long telephoneNumber, int salary, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary=salary;
        this.age=age;
        this.telephoneNumber= telephoneNumber;
        this.status=status;
    }

    @Override
    public String toString() {
        String result=firstName+" "+lastName+" "+age+" "+telephoneNumber+" "+salary+" "+status;
        return result;
    }


}

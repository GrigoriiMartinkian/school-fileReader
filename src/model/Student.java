package model;

public class Student extends Human {
    private int classNum;
    private Report report;

    public Student(String firstName, String lastName, int age, long telephoneNumber, int classNum, Report report) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.telephoneNumber=telephoneNumber;
        this.classNum= classNum;
        this.report= report;
    }
    public Report getReport(){
        return report;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        String result=firstName+" "+lastName+" "+age+" "+telephoneNumber+" "+classNum+" "+report;
        return result;
    }

}

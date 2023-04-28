package view;

import model.Report;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
    public int getCount() {
        Scanner scan = new Scanner(System.in);
        int count;
        System.out.println("Enter count of Student: ");
        count = scan.nextInt();
        return count;
    }

    public Student getStudentFromUser() {
        String Name, LastName;
        int age, classNum, english, geo, math;
        long telNumber;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Student: ");

        Name = scan.nextLine();
        LastName = scan.nextLine();
        age = scan.nextInt();
        telNumber = scan.nextLong();
        classNum=scan.nextInt();
        System.out.println("Enter Student marks: ");
        english = scan.nextInt();
        geo = scan.nextInt();
        math = scan.nextInt();
        Report report = new Report(english, geo, math);

        return new Student(Name, LastName, age, telNumber,classNum, report);

    }

    public void soutArrayStudents(ArrayList<Student> students) {
        System.out.println(students);
    }

    public void getMarksForStudent(ArrayList<Student> students) {
        Scanner scan = new Scanner(System.in);
        String student= scan.nextLine();
        for(int i=0; i< students.size(); i++) {
            if (student.equals(students.get(i).getLastName())){
                System.out.println(students.get(i).getReport());
            }
        }

    }
}

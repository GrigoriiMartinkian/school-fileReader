package file_work.file_work_student;

import model.Report;
import model.Student;

import java.io.*;
import java.net.InterfaceAddress;
import java.util.ArrayList;

public class FileReaderStudent {
    public ArrayList<Student> readStudent() {
        ArrayList<Student> students = new ArrayList<>();
        String fileSt = "";

        try {
            FileReader reader = new FileReader("C:\\Users\\towas\\OneDrive\\Рабочий стол\\student.txt");
            int c;
            while ((c = reader.read()) != -1) {
                if ((char) c == '\n') {
                    String arrStud[] = fileSt.split(" ");
                    Report report = new Report(Integer.parseInt(arrStud[5]),
                            Integer.parseInt(arrStud[6]), Integer.parseInt(arrStud[7]));

                    Student student = new Student(arrStud[0], arrStud[1], Integer.parseInt(arrStud[2]),
                            Long.parseLong(arrStud[3]), Integer.parseInt(arrStud[4]), report);
                    students.add(student);
                    fileSt = "";
                }

                fileSt = fileSt + (char) c;
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        return students;
    }
}

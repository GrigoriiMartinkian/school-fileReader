package file_work.file_work_student;

import model.Student;

import java.io.*;
import java.util.ArrayList;

public class FileWriterStudents {
    public static void writeStudent(ArrayList <Student> students) {
            try (FileWriter writer = new FileWriter("C:\\Users\\towas\\OneDrive\\Рабочий стол\\student.txt")) {
               for(int i=0; i<students.size(); i++) {
                   writer.write(students.get(i).toString()+"\n");
               }

            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }

    }
}

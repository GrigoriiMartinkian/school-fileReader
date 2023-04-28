package file_work.file_work_teacher;

import model.Student;
import model.Teacher;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriterTeacher {
    public static void writeTeacher(ArrayList <Teacher> teacher) {
            try (FileWriter writer = new FileWriter("C:\\Users\\towas\\OneDrive\\Рабочий стол\\teacher.txt")) {
               for(int i=0; i<teacher.size(); i++) {
                   writer.write(teacher.get(i).toString()+"\n");
               }

            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }

    }
}

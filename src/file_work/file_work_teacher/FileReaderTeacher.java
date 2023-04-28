package file_work.file_work_teacher;

import model.Status;
import model.Student;
import model.Teacher;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderTeacher {
    public static ArrayList<Teacher> readTeacher() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        String fileSt = "";
        try {
            FileReader reader = new FileReader("C:\\Users\\towas\\OneDrive\\Рабочий стол\\teacher.txt");
            int c;
            while ((c = reader.read()) != -1) {
                if ((char) c == '\n') {
                    String arrTeacher[] = fileSt.split(" ");

                    Teacher teacher = new Teacher(arrTeacher[0], arrTeacher[1], Integer.parseInt(arrTeacher[2]),
                            Long.parseLong(arrTeacher[3]),Integer.parseInt(arrTeacher[4]),
                            Status.getStatus(arrTeacher[5]));

                    teachers.add(teacher);
                    fileSt = "";
                }

                fileSt = fileSt + (char) c;
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        return teachers;
    }
}

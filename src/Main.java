import file_work.file_work_student.FileReaderStudent;
import file_work.file_work_student.FileWriterStudents;
import file_work.file_work_teacher.FileReaderTeacher;
import file_work.file_work_teacher.FileWriterTeacher;
import model.Status;
import model.Student;
import model.Teacher;
import view.StudentMenu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> listS = new ArrayList<>();



//        ArrayList<Teacher> listT = new ArrayList<>();
//        Teacher t1 = new Teacher("23", "23", 12, 12, 12, Status.TEACHER);
//        listT.add(t1);
//        Teacher t2 = new Teacher("24", "26", 16, 17, 17, Status.HEADTEACHER);
//        listT.add(t2);
//        FileWriterTeacher.writeTeacher(listT);

//   //     System.out.println(FileReaderTeacher.readTeacher());
//
//


        StudentMenu studentMenu = new StudentMenu();

        FileReaderStudent fR = new FileReaderStudent();
        studentMenu.soutArrayStudents(fR.readStudent());

        studentMenu.getMarksForStudent(fR.readStudent());



//        int count=studentMenu.getCount();
//        for (int i = 0; i < count; i++) {
//            Student st = studentMenu.getStudentFromUser();
//            listS.add(st);
//        }
//        FileWriterStudents.writeStudent(listS);







    }
}
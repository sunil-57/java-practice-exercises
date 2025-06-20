package Day3;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
            Student student1 = new Student("JPP1","Sunil" );
            Student student2 = new Student("JPP2","Aryan" );
            Student student3 = new Student("JPP3","Nischal" );
            Student student4 = new Student("JPP4","Gaurav" );
            Student student5 = new Student("JPP5","Sunita" );

            student1.changeGrade(56);
            student2.changeGrade(5);
            student3.changeGrade(66);
            student4.changeGrade(36);
            student5.changeGrade(76);

            ArrayList<Student> studentList = new ArrayList<>();
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            studentList.add(student5);




    }
}

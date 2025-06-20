package Day3;

import java.sql.SQLOutput;

public class Student {
    private String id;
    public String name;
    private int marks;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void changeGrade(int marksGivenByUser){
        this.marks = marksGivenByUser;
    }

    public String getGrade(){
        int marks = this.marks;
        if(marks < 0){
            return "Invalid Marks";
        }else{
            if(marks>70){
                return "A+";
            }else if(marks<60){
                return "pass";
            }
            else{
               return "Failed";
            }
        }
    }

}

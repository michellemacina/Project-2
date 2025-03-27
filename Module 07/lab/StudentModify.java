package lab;
//This is Task 2 Student Class 

public class StudentModify {
    private String name;
    private int studentId;
    private double gpa;
    private static int totalStudents = 0;
    

    public StudentModify(String name, int studentId, double gpa,int totalStudents) {
        this.name = name;
        this.studentId= studentId;
        this.gpa = gpa;
        this.totalStudents = totalStudents;
        totalStudents++;
    }
  
    public static int getTotalStudents() {
        return totalStudents;
    }
}

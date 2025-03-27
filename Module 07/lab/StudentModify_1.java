package lab;
//This is Task 2 Main 

public class StudentModify_1 {
    public static void main(String[] args){
        Student s4 = new Student();
        s4.name = "Student4";
        s4.studentId = 4;
        s4.gpa = 3.0;
        
        Student s5 = new Student();
        s5.name = "Student5";
        s5.studentId = 5;
        s5.gpa = 3.5;

        Student s6 = new Student();
        s6.name = "Rascal";
        s6.studentId = 6;
        s6.gpa = 2.0;
        
        Student s7 = new Student();
        s7.name = "Nova";
        s7.studentId = 7;
        s7.gpa = 1.5;

       System.out.println("Total Students"+ StudentModify.getTotalStudents());
    }
  
}


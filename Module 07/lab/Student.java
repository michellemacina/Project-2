package lab;
// This is Task 1 Student Class 

public class Student {
    String name;
    int studentId;
    double gpa;

    // can insert a method here or at the bottom 

    //method 
    public void displayname(){
        System.out.println("Student name"+ this.name + "Student Id" + this.studentId + "Student GPA" + this.gpa);
    }

    //no argument constructor 
    public Student() {
        name = "Unknown";
        studentId = 0;
        gpa = 0.0;
    }

    // parameterized constructor 
    public Student (String name, int studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }



    

}

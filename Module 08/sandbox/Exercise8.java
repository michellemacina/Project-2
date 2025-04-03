package sandbox;

import java.util.ArrayList;

//Student class 
class Student {
    String name;

    // Defines constructor
    public Student(String name) {
        this.name = name;
    }

    // override toString (not exactly sure what this is)
    @Override
    public String toString() {
        return "Student[ name='" + name + '\'' + ']';
    }
}

public class Exercise8 {
public static void main(String[] args){
 ArrayList <Student> students = new ArrayList<>();
 students.add(new Student("John"));
 students.add(new Student("Jane"));
 students.add(new Student("Jack"));

 // print student information 
 System.out.println("Student Information");
 System.out.println("Students in the list");
 for (Student student : students){
    System.out.println(student);
 }
 System.out.println("Total number of students" + students.size());

//removing a student 
//clearing the list 
//adding new students 
//removing all students 



}
}

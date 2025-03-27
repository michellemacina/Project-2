package lab;
// This is task 4 Classroom 

public class Classroom {
    Student[] students = new Student[30];
    int numStudents = 0;


    public void addStudent(Student s){
        students[numStudents] = s;
        numStudents++;
    }
    public void displayAllStudents(){
        for (int i = 0; i < numStudents;i++) {
            students[i].displayname();
        }
    }
}

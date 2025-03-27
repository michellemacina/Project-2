package lab;
// This is task 3 Student Class 
public class StudentModify_2 {
    private String name;
    private int studentId;
    private double gpa;

    public StudentModify_2 (String name, int studentId, double gpa){
            this.name = name;
            this.studentId = studentId;
            this.gpa = gpa;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
        // add a validation to ensure that the gpa is between 0.0 and 4.0 
    }
}

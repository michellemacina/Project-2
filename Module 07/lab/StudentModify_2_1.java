package lab;
//This is Task 3 Main Modified 

public class StudentModify_2_1 {
    public static void main(String[] args){
        StudentModify_2 s3 = new StudentModify_2(null, 0, 0);

       s3.setName("Unknown");
       s3.setStudentId(0);
       s3.setGpa(0.0);

       System.out.println("Student Name"+ s3.getName() + "Student ID" + s3.getStudentId() + "Student GPA" + s3.getGpa() );

    }
}

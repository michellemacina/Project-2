package lab;

import java.util.ArrayList;

// create superclass Employees 
class Employee {
    // add fields to class
    String name;
    int id;

    // contructor to initialize
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // method display Info
    void displayInfo() {
        System.out.println("Employee:" + name + " ID:" + id);
    }
}

// create subclasse FullTimeEmployee
class FullTimeEmployee extends Employee {

    // fields specific to full time employee
    double salary;

    // constructor specific to the subclass
    FullTimeEmployee(String name, int id, double salary) {
        // super because that is also a part of the superclass not specific to the
        // subclass
        super(name, id);
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Full Time Employee " + "Salary:" + salary);
    }

    //add method for Calculate Pay 
    double calculatePay(){
        return salary;
    }

}

// create subclass PartTimeEmployee
class PartTimeEmployee extends Employee {

    // fields specific to Part Time Employee
    double hourlyRate;
    int hoursWorked;

    // constructor specific to the subclass
    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Part Time Employee " +  "HourlyRate" + hourlyRate + " Hours Worked:" + hoursWorked);
    }

    //add method for Calculate Pay 
    double calculatePay(){
        return hourlyRate * hoursWorked;
    }

}

public class Lab8 {
    public static void main(String[] args) {
        // create Array List
        ArrayList<Employee> employees = new ArrayList<>();

        // Add employees 2 part time 2 full time
        employees.add(new FullTimeEmployee("John", 1, 70000.00));
        employees.add(new FullTimeEmployee("Jane", 2, 80000.00));
        employees.add(new PartTimeEmployee("Joe", 3, 20.00, 40));
        employees.add(new PartTimeEmployee("Julie", 4, 25.00, 45));
      

        // loop for displaying each employee
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee){
                ((FullTimeEmployee) employee).displayInfo();
            } else if (employee instanceof PartTimeEmployee){
                ((PartTimeEmployee) employee).displayInfo();
            }
        }
    }
}
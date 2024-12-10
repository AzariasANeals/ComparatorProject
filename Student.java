import java.util.*;
/**
 * This is the Student class, it implements Comparable.
 * Here you can create a new Student with a studentID, name and their gpa.
 * There are getter functions that allow you to retrieve the student ID, name, and gpa.
 * 
 * We also have a compareTo method that will compare Student GPAs.
 */
public class Student implements Comparable
{
    private int studentId;
    private String name;
    private double gpa;
    public static final double INVALID_GPA = -1.0;
    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 4.0;
    public Student(int studentId, String name, double gpa){
        this.studentId = studentId;
        this.name = name;
        if(gpa >= MIN_GPA && gpa <= MAX_GPA){
            this.gpa = gpa;    
        }
        else{
            this.gpa = INVALID_GPA;
        }
        
    }
    
    public int getStudentId(){
        return studentId;
    }
    
    public String getName(){
        return name;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public int compareTo(Object s){
        // Here we are casting the object to a Student class for the comparison.
        if(((Student)s).gpa == gpa){
            return 0;
        }
        else if(((Student)s).gpa > gpa)
        {
            return -1;
        }
        else{
            return 1;
        }
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: " + studentId + "\n");
        sb.append("Name: " + name + "\n");
        sb.append("GPA: " + gpa + "\n\n");
        return sb.toString();
    }
}

import java.util.*;
/**
    This is the Main class. Here I have created a new 
    Student array and populated it with student entries, each one
    containing a student ID, name, and gpa. I then use Arrays.sort to
    sort the array and a for-each loop to display the entries in the array
    sorted.
 */
public class Main
{
    public static void main(String[] args){
        Student students[] = new Student[5];
        students[0] = new Student(123456, "Mark", 3.3);
        students[1] = new Student(987654, "John", 2.5);
        students[2] = new Student(654987, "Steph", 4.0);
        students[3] = new Student(321456, "Stephanie", 3.3);
        students[4] = new Student(741852, "Beth", 1.9);

        Arrays.sort(students);

        for(Student n : students){
            System.out.println(n);
        }

    }
}

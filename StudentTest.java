

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    private Student s1;
    private Student s2;
    private Student s3;
    
    // n1 has a null name, n2 has a invalid gpa
    private Student n1;
    private Student n2;
    
    private final int id1 = 10;
    private final int id2 = 25;
    private final int id3 = 30;
    private final String name1 = "John";
    private final String name2 = "Brad";
    private final String name3 = "Mark";
    private final double gpa1 = 2.9;
    private final double gpa2 = 3.8;
    private final double gpa3 = 3.8;
    /**
     * Default constructor for test class StudentTest
     */
    
    public StudentTest()
    {
        s1 = new Student(id1, name1, gpa1);
        s2 = new Student(id2, name2, gpa2);
        s3 = new Student(id3, name3, gpa3);
        n1 = new Student(id1, null, gpa1);
        n2 = new Student(id1, name1, 6.0);

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    // 3 Normal Test Cases
    @Test
    public void testGetName(){
        String expected = name1;
        String actual = s1.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetStudentID(){
        int expected = id1;
        int actual = s1.getStudentId();
        assertEquals(expected, actual);
    }
    @Test
    public void testCompareToEqual(){
        int expected = 0;
        int actual = s3.compareTo(s2);
        assertEquals(expected, actual);
    }
    @Test
    public void testCompareToGreaterThan(){
        int expected = 1;
        int actual = s3.compareTo(s1);
        assertEquals(expected, actual);
    }
    @Test
    public void testCompareToLessThan(){
        int expected = -1;
        int actual = s1.compareTo(s2);
        assertEquals(expected, actual);
    }    
    
    //3 Edge Test Cases
    @Test
    public void testNullGetName(){
        String expected = null;
        String actual = n1.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidGetGPA(){
        // We use Student.INVALID_GPA because it is a static class constant.
        // So it goes with the class and not with a specific object.
        double expected = Student.INVALID_GPA;
        double actual = n2.getGPA();
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidGPACompareTo(){
        int expected = 1;
        int actual = s1.compareTo(n2);
        assertEquals(expected, actual);
    }
}

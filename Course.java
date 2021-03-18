import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private int courseNumber;
    private String courseTitle;
    private ArrayList<Student> students;
    private String instructor;
    private HashMap<Student,Integer> grades;

    /**
     * Constructor for objects of class Course
     */
    public Course()
    {
        // initialise instance variables
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
        this.instructor = instructor;
        students = new ArrayList<>();
        grades = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addGrade(Student student, int grade)
    {
        // put your code here
        grades.put(student,grade);
    }
}

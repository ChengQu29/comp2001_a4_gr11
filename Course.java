import java.util.ArrayList;
import java.util.HashMap;
/**
 * The course class creates course objects that are added to the university.
 * and can be enrolled in by students.
 * @author (Luke Penney)
 * @version (22/03/2021)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String courseNumber;
    private String courseTitle;
    private ArrayList<Student> students;
    private String instructor;
    private HashMap<Student,Integer> grades;

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseNumber, String courseTitle, String instructor)
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
    
    public String getCourseNum()
    {
        return courseNumber;
    }
    
    public String getCourseTitle()
    {
        return courseTitle;
    }
    
    public String getInstructor()
    {
        return instructor;
    }
}

import java.util.ArrayList;
/**
 * Write a description of class University here.
 *
 * @author (Luke Penney)
 * @version (22/03/2021)
 */
public class University
{
    // instance variables - replace the example below with your own
    private ArrayList<Student> studentsInUniversity;
    private ArrayList<Course> coursesOffered;
    /**
     * Constructor for objects of class University
     */
    public University()
    {
        // initialise instance variables
        studentsInUniversity = new ArrayList<>();
        coursesOffered = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addCourse(Course newCourse)
    {
        // put your code here
        coursesOffered.add(newCourse);
    }
    public void addStudent(Student newStudent)
    {
        studentsInUniversity.add(newStudent);
    }
    public void printCourseInfo()
    {
       coursesOffered.stream()
                     .forEach(s -> System.out.println(s.getCourseNum() + "-" + s.getCourseTitle() + "-" + s.getInstructor()));
    }
}

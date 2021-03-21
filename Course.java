
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Course
{
    // instance variables - replace the example below with your own
    private String courseID;
    private String courseTitle;
    private String instructor;
    private ArrayList<Student> students;
    private HashMap<Student, Integer> grades;

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseID, String courseTitle, String instructor)
    {
        // initialise instance variables
        this.courseID = courseID;
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
    public void addStudent(Student student)
    {
        // put your code here
        students.add(student);
    }
    
    public void assignGrade(Student student, int grade)
    {
        grades.put(student, grade);
    }
    
    public int getGrade(Student student)
    {
        return grades.get(student);
    }
    
    public void dropStudent(Student student)
    {
        students.remove(student);
    }
    
    public ArrayList getStudent()
    {
        return students;
    }
    
    public String getCourseTitle(){
        return courseTitle;
    }
    
    public void displayCourseInfo()
    {
        System.out.println(courseID +" "+ courseTitle + " " + instructor);
        
        for (Student student:students)
        {
            System.out.println(student.getStudentName()+ " " + grades.get(student));
        }
        
    }
}

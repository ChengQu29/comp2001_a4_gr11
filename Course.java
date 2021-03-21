
/**
 * The course class creates course objects that are added to the university.
 * and can be enrolled in by students.
 * @author (Luke Penney)
 * @version (22/03/2021)
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Course
{

    private String courseNumber;
    private String courseTitle;
    private String instructor;
    private ArrayList<Student> students;
    private HashMap<Student, Integer> grades;

    /**
     * Constructor for objects of class Course
     * 
     * @param courseNumber is a string ex: "comp2001"
     * @param courseTitle is the string title of the course ex: "into to oop"
     * @param is the name of the instructor as a string ex: "Adrian Fiech"
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
        System.out.println(courseNumber +" "+ courseTitle + " " + instructor);
        
        for (Student student:students)
        {
            System.out.println(student.getStudentName()+ " " + grades.get(student));
        }
        
    }
}

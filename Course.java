
/**
 * The course class creates course objects to be added to the university by Admin.
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
     * method to add a student for the course
     */
    public void addStudent(Student student)
    {
        // put your code here
        students.add(student);
    }
    
    /**
     * assign grade for a student
     */
    public void assignGrade(Student student, int grade)
    {
        grades.put(student, grade);
    }
    
    /**
     * getter method to get grade for a student
     */
    public int getGrade(Student student)
    {
        return grades.get(student);
    }
    
    /**
     * drop a student from the course
     */
    public void dropStudent(Student student)
    {
        students.remove(student);
    }
    
    /**
     * get the number of students registered for the course
     */
    public ArrayList getStudent()
    {
        return students;
    }
    
    /**
     * get course title
     */
    public String getCourseTitle(){
        return courseTitle;
    }
    
    /**
     * get course number
     */
    public String getCourseNumber(){
        return courseNumber;
    }
    
    /**
     * get instructor name for the course
     */
    public String getInstructor(){
        return instructor;
    }
    
    /**
     * Display course info for the registered student
     */
    public void displayCourseInfo(Student student)
    {
        System.out.println(courseNumber + " "+ courseTitle + " " + instructor);
        
        System.out.println(student.getStudentName()+ " " + grades.get(student));
        
        
    }
}

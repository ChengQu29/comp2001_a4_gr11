/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String studentName;
    private int studentID;
    private String department;
    //private ArrayList<Course> courses;

    /**
     * Constructor for objects of class Student
     */
    public Student(String studentName, int studentID, String department)
    {
        // initialise instance variables
        this.studentName = studentName;
        this.studentID = studentID;
        this.department = department;
        //courses = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getStudentName()
    {
        // put your code here
        return studentName;
    }
    
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    public String getDepartment()
    {
        return department;
    }
     
}

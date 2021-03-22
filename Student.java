/**
 * The student class creates student objects to be added to the university by Admin.
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String studentName;
    private int studentID;
    private String department;

    /**
     * Constructor for objects of class Student
     */
    public Student(String studentName, int studentID, String department)
    {
        // initialise instance variables
        this.studentName = studentName;
        this.studentID = studentID;
        this.department = department;
    }

    /**
     * get student name
     */
    public String getStudentName()
    {
        return studentName;
    }
    
    /**
     * getter method to get student name
     */
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    /**
     * get student department
     */
    public String getDepartment()
    {
        return department;
    }
}

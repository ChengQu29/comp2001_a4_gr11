import java.util.ArrayList;
/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class University
{
    // instance variables - replace the example below with your own
    private ArrayList<Course> courseList;
    private ArrayList<Student> studentList;

    /**
     * Constructor for objects of class Admin
     */
    public University()
    {
        // initialise instance variables
        courseList = new ArrayList<>();
        studentList = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printCourseOffered()
    {
        // put your code here
        System.out.println("Courses offered by the university: ");
        for (Course course:courseList){
            System.out.println(course.getCourseNumber()+" "+course.getCourseTitle()+" "+course.getInstructor());
            System.out.println();
        }
    }
    
    public void printStudentInDepartment(String departmentName)
    {
        System.out.println("Students in " + departmentName +":");
        for(Student student:studentList)
        {
            if(student.getDepartment().equals(departmentName)){
                System.out.println(student.getStudentName()); //update this to get all info about a student
            }
        }
    }
    
    public void addCourse(Course course)
    {
        courseList.add(course);
    }
    
    public void dropCourse(Course course)
    {
        courseList.remove(course);
    }
    
    public void addStudent(Student student)
    {
        studentList.add(student);
    }
    
    public void enrollStudentInCourse(Student student, Course course)
    {
        course.addStudent(student);
    }
    
    public void printCourseInfoForStudent(Student student)
    {
        for (Course course:courseList)
        {
            ArrayList studentsInCourse = course.getStudent();
            if (studentsInCourse.contains(student)){
                course.displayCourseInfo(student);
            }
        }
    }
}

import java.util.ArrayList;
/**
 * Admin class to add new course and student to the university,
 * enroll student in courses (enrollStudentInCourse) 
 * provide a way for student to keep track of courses(printCourseInfoForStudent)
 * prints info about all offered courses
 * prints info for all students in a given department
 * @author (Chengwen Qu)
 * @version (22/03/2021)
 */
public class Admin
{
    // instance variables - replace the example below with your own
    private ArrayList<Course> courseList;
    private ArrayList<Student> studentList;

    /**
     * Constructor for objects of class Admin
     */
    public Admin()
    {
        // initialise instance variables
        courseList = new ArrayList<>();
        studentList = new ArrayList<>();
    }

    /**
     * prints info about all offered courses
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
    
    /**
     * prints info for all students in a given department
     */
    public void printStudentInDepartment(String departmentName)
    {
        System.out.println("Students in " + departmentName +":");
        for(Student student:studentList)
        {
            if(student.getDepartment().equals(departmentName)){
                System.out.println(student.getStudentName() + " " + "registered: ");
                printCourseInfoForStudent(student);
            }
        }
    }
    
    /**
     * add new course to university
     */
    public void addCourse(Course course)
    {
        courseList.add(course);
    }
    
    /**
     * drop course for the university (not for the student)
     */
    public void dropCourse(Course course)
    {
        courseList.remove(course);
    }
    
    /**
     * add student to the university 
     */
    public void addStudent(Student student)
    {
        studentList.add(student);
    }
    
    /**
     * enroll student in courses
     */
    public void enrollStudentInCourse(Student student, Course course)
    {
        course.addStudent(student);
    }
    
    /**
     * print info for student to keep track of courses and grades in which they are enrolled
     */
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

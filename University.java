import java.util.ArrayList;
/**
 * This method contains all the registered students and courses offered.
 *
 * @author (Luke Penney)
 * @version (22/03/2021)
 */
public class University
{
    // ArrayLists containing all the offered courses 
    // and registered students
    private ArrayList<Student> studentsInUniversity;
    private ArrayList<Course> coursesOffered;
    /**
     * Constructor for objects of class University
     */
    public University()
    {
        // initialize ArrayLists for students and courses
        studentsInUniversity = new ArrayList<>();
        coursesOffered = new ArrayList<>();
    }

    /**
     * addCourse adds new courses to the university 
     *
     * @param  newCourse is the new course object to be added to the coursesOffered ArrayList
     */
    public void addCourse(Course newCourse)
    {
        coursesOffered.add(newCourse);
    }
    /**
     * addStudent adds new students to the university
     * 
     * @param newStudent is a student object that is added to the studenstInUniversity ArrayList
     */
    public void addStudent(Student newStudent)
    {
        studentsInUniversity.add(newStudent);
    }
    /**
     * printCourseInfo prints all the info about all the offered courses
     * 
     */
    public void printCourseInfo()
    {
       coursesOffered.stream()
                     .forEach(s -> System.out.println(s.getCourseNum() + "-" + s.getCourseTitle() + "-" + s.getInstructor()));
    }
    
    public void printStudentInfo()
    {
        
    }
}

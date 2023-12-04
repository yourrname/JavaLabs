package model;

/**
 * Class for information about a student.
 */
public class Student extends Person {

    /**
     * List of identifiers of courses (CourseInstance.id) completed by the student.
     */
    private long[] completedCourses;

    // TODO: Add getters and setters
    public long[] getCompletedCourses(){
        return this.completedCourses;
    }
    public void setCompletedCourses(long[] completedCourses){
        this.completedCourses=completedCourses;
    }

    public Student() {
        
    }
    Student(long id,String name,long[] completedCourses){
        this.setId(id);
        this.setName(name);
        this.setCompletedCourses(completedCourses);
    }
}

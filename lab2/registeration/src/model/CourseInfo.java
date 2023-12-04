package model;

/**
 * Class for basic information about a course.
 */
public class CourseInfo {

    /**
     * Course identifier.
     */
    private long id;

    /**
     * Course name.
     */
    private String name;

    /**
     * Brief description of the course.
     */
    private String description;

    /**
     * List of course identifiers that must be completed before the start of this course.
     */
    private long[] prerequisites;

    /**
     * List of student categories that are allowed to attend the course.
     */
    private StudentCategory[] studentCategories;

    // TODO: Add getters and setters
    //ID
    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id=id;
    }
    //String
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    //description

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
    }

    //prerequisites
    public long[] getPrerequisites(){
        return this.prerequisites;
    }
    public void setPrerequisites(long[] prerequisites){
        this.prerequisites=prerequisites;
    }

    //Student Category
    public StudentCategory[] getStudentCategories(){
        return this.studentCategories;
    }
    public void setStudentCategories(StudentCategory[] studentCategories){
        this.studentCategories=studentCategories;
    }

    public CourseInfo() {
        
    }

    CourseInfo(long id , String name ,StudentCategory[] studentCategories  ){
        this.setId(id);
        this.setName(name);
        this.setStudentCategories(studentCategories);
    }

    CourseInfo(long id , String name, String description ,StudentCategory[] studentCategories  ){
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setStudentCategories(studentCategories);
    }

    CourseInfo(long id , String name, String description ,long[] prerequisites,StudentCategory[] studentCategories  ){
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrerequisites(prerequisites);
        this.setStudentCategories(studentCategories);
    }






}
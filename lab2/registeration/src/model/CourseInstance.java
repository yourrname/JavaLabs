package model;

import java.time.LocalDate;


/**
 * Class with data about a course instance. A single course (e.g., Discrete Mathematics) may be conducted multiple times.
 */
public class CourseInstance {

    /**
     * Course instance identifier.
     */
    private long id;

    /**
     * Course identifier corresponding to CourseInfo.id.
     */
    private long courseId;

    /**
     * Instructor identifier.
     */
    private long instructorId;

    /**
     * Start date of the course.
     */
    private LocalDate startDate;

    /**
     * Limit on the number of students for the course.
     */
    private int capacity;

    // TODO: Add getters and setters
    //ID
    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id=id;
    }

    //courseId
    public long getCourseId(){
        return this.courseId;
    }
    public void setCourseId(long courseId){
        this.courseId=courseId;
    }

    //instructionId
    public long getInstructorId(){
        return this.instructorId;
    }
    public void setInstructorId(long instructorId){
        this.instructorId=instructorId;
    }


    //startDate
    public LocalDate getStartDate(){
        return this.startDate;
    }
    public void setStartDate(LocalDate startDate){
        this.startDate=startDate;
    }

    //capacity
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    public CourseInstance() {
        
    }


    CourseInstance(long id,long courseId,LocalDate startDate,long instructorId,int capacity){
        this.setId(id);;
        this.setCourseId(courseId);
        this.setStartDate(startDate);
        this.setInstructorId(instructorId);
        this.setCapacity(capacity);

    }
    CourseInstance(long id,long courseId,LocalDate startDate,long instructorId){
        this.setId(id);;
        this.setCourseId(courseId);
        this.setStartDate(startDate);
        this.setInstructorId(instructorId);

    }
    public boolean deadline(long courseId){
        boolean ended= true;
        LocalDate today = LocalDate.now();
        if(today.isBefore(getStartDate())){
            ended=false;
        }
        return true;
    }
    
    public boolean courseValidation(long courseId){
        boolean valid=false;
        if(!deadline(courseId)){
            valid=true;
        }
        if(getCapacity()>0){
            valid=true;
        }


        if(valid==false){
            return false;
        }else{
            return true;
        }
        
    }
}
package model;

/**
 * Class for information about an instructor.
 */
public class Instructor extends Person {

    /**
     * Identifiers of courses that the instructor can teach.
     */
    private int[] canTeach;

    // TODO: Add getters and setters
    public int[] getCanTeach(){
        return this.canTeach;
    }
    public void setCanTeach(int[] canTeach){
        this.canTeach=canTeach;
    }
    public Instructor() {
        
    }
    
    Instructor(long id,String name,int[] canTeach){
        this.setId(id);
        this.setName(name);
        this.setCanTeach(canTeach);
    }
}
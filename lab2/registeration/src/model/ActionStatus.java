package model;
import model.CourseInstance;

/**
 * Enum для статуса выполнения операции
 */
public enum ActionStatus {
    Successful,Unsuccessful;

    

    public static  ActionStatus subscribe(long studentId, long courseId,CourseInstance course){
        boolean subscriptionSuccessful = course.courseValidation(courseId);
        if (subscriptionSuccessful) {
            return Successful;
        } else {
            return Unsuccessful;
        }
    }
    
    public static  ActionStatus unsubscribe(long studentId, long courseId,CourseInstance course){
        boolean subscriptionSuccessful = course.deadline(courseId);
        if (subscriptionSuccessful) {
            return Successful;
        } else {
            return Unsuccessful;
        }
    }
    
    
}
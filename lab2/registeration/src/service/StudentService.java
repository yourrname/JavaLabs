package service;

import model.ActionStatus;
import model.CourseInstance;
/**
 * Service interface for students.
 */
public interface StudentService {

    /**
     * Registering a student for a course. Registration is possible under the following conditions:
     * - The course has not yet started;
     * - The course is intended for the category of the given student (master/bachelor);
     * - The student has completed all mandatory courses required for attending the specified course;
     * - There are available seats in the course.
     *
     * @param studentId Student identifier
     * @param courseId Course identifier corresponding to CourseInstance.id
     * @return Registration result
     */
    ActionStatus subscribe(long studentId, long courseId,CourseInstance course);

    /**
     * Canceling a student's registration for a course, which is possible only if
     * the course has not yet started.
     *
     * @param studentId Student identifier
     * @param courseId Course identifier corresponding to CourseInstance.id
     * @return Unsubscribe result
     */
    ActionStatus unsubscribe(long studentId, long courseId,CourseInstance course);

    /**
     * @param studentId Student identifier
     * @return List of all courses to which the student is subscribed
     */
    CourseInstance[] findAllSubscriptionsByStudentId(long studentId);
    
}

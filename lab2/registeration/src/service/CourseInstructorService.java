package service;

import model.Instructor;
import model.ActionStatus;
import model.Student;


/**
 * Service interface for a course instructor.
 */
public interface CourseInstructorService {
    
    /**
     * @param courseId Course identifier
     * @return List of students registered for the specified course
     */
    public Student[] findStudentsByCourseId(long courseId);

    /**
     * @param instructorId Instructor identifier
     * @return List of students attending one of the courses taught by the specified instructor
     */
    Student[] findStudentsByInstructorId(long instructorId);

    /**
     * @param instructorId Instructor identifier
     * @param courseId Course identifier
     * @return List of instructors who can teach the specified course instead of the given instructor
     */
    Instructor[] findReplacement(long instructorId, long courseId);

}
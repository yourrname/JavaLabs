package reader;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.CourseInfo;
import model.CourseInstance;
import model.Instructor;
import model.Student;

import java.io.File;
import java.io.IOException;

/**
 * Класс для чтения информации о студентах из файлов
 */
public class StudentDataReader {

    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @return список студентов-бакалавров
     */
    public Student[] readBachelorStudentData() throws IOException {
        return objectMapper.readValue(new File("src/resources/bachelorStudents.json"), Student[].class);
    }

    /**
     * @return список студентов-магистров
     */
    public Student[] readMasterStudentData() throws IOException {
        return objectMapper.readValue(new File("src/resources/masterStudents.json"), Student[].class);
    }

    public CourseInfo[] readCourseInfoData() throws IOException {
        return objectMapper.readValue(new File("src/resources/courseInfos.json"), CourseInfo[].class);
    }

    public CourseInstance[] readCourseInstanceData() throws IOException {
        return objectMapper.readValue(new File("src/resources/courseInstances.json"), CourseInstance[].class);
    }

    public Instructor[] readinstructorsData() throws IOException {
        return objectMapper.readValue(new File("src/resources/instructors.json"), Instructor[].class);
    }

}
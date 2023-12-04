package reader;

import model.ActionStatus;
import model.CourseInfo;
import model.CourseInstance;
import model.Instructor;
import model.Student;
import reader.StudentDataReader;
import service.StudentService;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDataReader reader = new StudentDataReader();

        try {
            Student[] bachelorStudents = reader.readBachelorStudentData();
            Student[] masterStudents = reader.readMasterStudentData();
            CourseInfo[] courseInfo = reader.readCourseInfoData();
            CourseInstance[] courseInstance = reader.readCourseInstanceData();
            Instructor[] instructor = reader.readinstructorsData();
            CourseInstance courseInstance2=new CourseInstance();
            
            System.out.println("Are you a Bachelor Student [1]  or Master Student [2]");
            Scanner input = new Scanner(System.in);
            int choice= input.nextInt();

            if(choice==1){
                for (Student student : bachelorStudents) {
                    ActionStatus result = subscribe(student.getId(),courseInfo[1].getId(),courseInstance2);
                    System.out.println(result);
                }
            }else if(choice==2){
                for (Student student : masterStudents) {
                    for(CourseInfo courseInformation:courseInfo){
                        ActionStatus result = subscribe(student.getId(),courseInformation.getId(),courseInstance2);
                        System.out.println(result);
                    }
                    
                }
            }
            
            



        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
    private static ActionStatus subscribe(long studentId, long courseId,CourseInstance course) {
        return ActionStatus.subscribe(studentId, courseId, course);
    }


    
}
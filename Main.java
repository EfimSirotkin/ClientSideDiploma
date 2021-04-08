package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.http.QueryGenerator;
import sample.json.deserializer.*;
import sample.objects.*;

import java.util.ArrayList;

public class Main extends Application {


    public static ArrayList<Grade> grades;
    public static ArrayList<Pupil> pupils;
    public static ArrayList<SchoolClass> schoolClasses;
    public static ArrayList<Subject> schoolSubjects;
    public static ArrayList<Teacher> schoolTeachers;

    @Override
    public void start(Stage primaryStage) throws Exception{

        QueryGenerator queryGenerator = new QueryGenerator();

        PupilDeserializer pupilDeserializer = new PupilDeserializer();
        pupils = pupilDeserializer.deserialize(queryGenerator.queryPupils());

        SchoolClassDeserializer schoolClassDeserializer = new SchoolClassDeserializer();
        schoolClasses = schoolClassDeserializer.deserialize(queryGenerator.querySchoolClasses());

        SchoolSubjectsDeserializer schoolSubjectsDeserializer = new SchoolSubjectsDeserializer();
        schoolSubjects = schoolSubjectsDeserializer.deserialize(queryGenerator.querySubjects());

        TeacherDeserializer teacherDeserializer = new TeacherDeserializer();
        schoolTeachers = teacherDeserializer.deserialize(queryGenerator.queryTeachers());
        for(Teacher teacher : schoolTeachers)
            teacher.printTeacher();

        GradeDeserializer gradeDeserializer = new GradeDeserializer();
        grades = gradeDeserializer.deserialize(queryGenerator.queryGrades());


    }


    public static void main(String[] args) {
        launch(args);
    }
}

package Exercitii.StudentGradingSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentGrade {
    private static Map<String, Float> studentGrades = new HashMap<>();


    public Map<String, Float> getStudentGrades() {
        return studentGrades;
    }

    public StudentGrade setStudentGrades(Map<String, Float> studentGrades) {
        this.studentGrades = studentGrades;
        return this;
    }

    public boolean addStudentGrade(String studentName, float grade) {
        if (studentGrades.containsKey(studentName)) {
            System.out.println("Student: " + studentName + " already exists");
            return false;
        } else {
            studentGrades.put(studentName, grade);
            System.out.println("Student: " + studentName + " added with grade: " + grade);
            return true;
        }
    }

    public boolean updateGrades(String studentName, float newGrade) {
        if (studentGrades.containsKey(studentName)) {
            studentGrades.put(studentName, newGrade);
            System.out.println("Student: " + studentName + " with new grade: " + newGrade);
            return true;
        } else {
            System.out.println("Student " + studentName + " doesn't exists");
        }
        return false;
    }

    public void getStudentGradeByName(String studentName){
       for(Map.Entry<String,Float> getName : studentGrades.entrySet()){
           System.out.println("Student: " + getName.getValue());

        }
    }

    public void printAllStudentGrades() {
        for (Map.Entry<String, Float> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }

    public static boolean printAllGrades(){
    for(Map.Entry<String,Float> allStudents : studentGrades.entrySet()){
        System.out.println("Student: " + allStudents.getKey() + ", Grade: " + allStudents.getValue());
    }
        return false;
    }
}

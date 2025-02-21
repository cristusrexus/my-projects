package Exercitii.StudentGradingSystem;
//https://github.com/4PEAT/advanced-features/blob/main/Day05/Task03.md
public class MainApplication {
    public static void main(String[] args) {
        StudentGrade student1 = new StudentGrade();
        StudentGrade student2 = new StudentGrade();
        StudentGrade student3 = new StudentGrade();
        StudentGrade alice = new StudentGrade();
        System.out.println("-------------------------Add student and grade ");
        student1.addStudentGrade("Florin", 54.4f);
        student2.addStudentGrade("Georgica",23.5f);
        student3.addStudentGrade("Ioana " , 67.5f);
        alice.addStudentGrade("Alice",90);
        System.out.println("-------------------------Atempting to duplicate student !");
        student1.addStudentGrade("Florin", 54.4f);
        System.out.println("---------------------------Update students grade");
        alice.updateGrades("Alice",95);
        student1.updateGrades("Florin", 98.4f);
        System.out.println("---------------------------Student doesn't exists");
        student1.updateGrades("George" ,44.4f);
        System.out.println("--------------------------- only student's grades");
        student2.getStudentGradeByName("Georgica");
        student3.getStudentGradeByName("Ioana");
        System.out.println("------------------------ All students and theyr grades ");
        System.out.println(StudentGrade.printAllGrades());
    }
}

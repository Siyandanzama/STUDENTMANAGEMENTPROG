/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siyanda
 */
public class MainApp {
     public static void main(String[] args) {

        StudentManager manager = new StudentManager(3);

        int[] marks1 = {80, 70, 90};
        int[] marks2 = {50, 60, 55};
        int[] marks3 = {30, 40, 45};

        Student s1 = new Student("Siyanda", 20, marks1);
        Student s2 = new Student("John", 22, marks2);
        Student s3 = new Student("Lisa", 19, marks3);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        manager.generateReport();
    }
}
    

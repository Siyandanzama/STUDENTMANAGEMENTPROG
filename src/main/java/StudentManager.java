/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siyanda
 */
public class StudentManager {
      private Student[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        }
    }

    public void generateReport() {
        System.out.println("===== STUDENT REPORT =====");

        for (int i = 0; i < count; i++) {
            Student s = students[i];

            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Average: " + s.calculateAverage());
            System.out.println("Grade: " + s.getGrade());
            System.out.println("--------------------------");
        }
    }

   
}
    



import com.mycompany.studentmanagementsystem.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siyanda
 */
public class Student extends Person {
     private int[] marks;

    public Student(String name, int age, int[] marks) {
        super(name, age);
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    public String getGrade() {
        double avg = calculateAverage();

        if (avg >= 75) return "Distinction";
        else if (avg >= 50) return "Pass";
        else return "Fail";
    }

    
}
    


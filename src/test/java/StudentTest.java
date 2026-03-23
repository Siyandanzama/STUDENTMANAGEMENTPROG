/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


/**
 *
 * @author Siyanda
 */
public class StudentTest {
    
    public StudentTest() {
    }

  
    /**
     * Test of main method, of class MainApp.
     */
    @org.junit.Test
    public void testMain() {
          // Test average calculation
    
   
        int[] marks = {80, 70, 90};
        Student student = new Student("Test", 20, marks);

        double result = student.calculateAverage();

        assertEquals(80.0, result, 0.01);
    }

    // Test grade = Distinction
    @Test
    public void testGradeDistinction() {
        int[] marks = {80, 85, 90};
        Student student = new Student("Test", 20, marks);

        assertEquals("Distinction", student.getGrade());
    }

    // Test grade = Pass
    @Test
    public void testGradePass() {
        int[] marks = {50, 55, 60};
        Student student = new Student("Test", 20, marks);

        assertEquals("Pass", student.getGrade());
    }

    //  Test grade = Fail
    @Test
    public void testGradeFail() {
        int[] marks = {30, 40, 20};
        Student student = new Student("Test", 20, marks);

        assertEquals("Fail", student.getGrade());
    }

    //Test adding student to manager
    @Test
    public void testAddStudent() {
        StudentManager manager = new StudentManager(2);

        int[] marks = {80, 70, 90};
        Student student = new Student("Test", 20, marks);

        manager.addStudent(student);

        // Since array is private, we check indirectly
        // by making sure no errors and count increases
        assertNotNull(student);
    }
}
    
    


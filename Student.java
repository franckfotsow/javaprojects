/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Student {
    private String matricule;
    private String name;
    private int[] marks;

    public Student(String matricule, String name, int[] marks) {
        this.matricule = matricule;
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student matricule: ");
        String matricule = scanner.nextLine();

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        Student student = new Student(matricule, name, marks);
        System.out.println("Average mark: " + student.calculateAverage());
    }
}
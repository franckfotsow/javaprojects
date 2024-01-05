/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraystudent;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Arraystudent {
   
    public static void main(String[] args) {
        int number;
    Scanner marks = new Scanner(System.in);
    System.out.print("Total number of elements: ");
    number = marks.nextInt();
    int[] array = new int[20];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < number; i++) {
      array[i] = marks.nextInt(); // reads elements from the user
    }
    System.out.println("Array elements you entered are: ");
    for (int i = 0; i < number; i++) {
      System.out.println(array[i]);
        
    }
    
}
}

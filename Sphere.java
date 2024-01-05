/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sphere;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Sphere {
    double raduis;
    double volume(double ra){
        return Math.PI*((float)4/3)*(Math.pow(ra, 3));
    }
            
    public static void main(String[] args) {
        double r ;
         System.out.println("enter the raduis of the sphere");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();
        Sphere waffo = new Sphere();
        waffo.raduis=r;
        System.out.println("the volume of the sphere is: "+waffo.volume(r));
                
    }
    
}

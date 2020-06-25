/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author ronnycajas
 */
public class ClsMain {
    

    public static void main(String[] args) {
            

        Scanner input = new Scanner(System.in);

        String nombre = input.nextLine();
        System.out.println("Contacto " + nombre+" ingresado exitosamente!!");

        // closing the scanner object
        input.close();
        
        
        Scanner inpt = new Scanner(System.in);

        int edad = inpt.nextInt();
        System.out.println("Contacto " + edad+" ingresado exitosamente!!");

        // closing the scanner object
        inpt.close();
        
    }
    
}

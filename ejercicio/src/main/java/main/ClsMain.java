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
            
        String nombre;
        String edad;

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        System.out.println("Contacto " + number+" ingresado exitosamente!!");

        // closing the scanner object
        input.close();
    }
    
}

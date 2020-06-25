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
    
    public static void recogeContacto(){
        
                System.out.println("Escribe un nombre \n");
        
        Scanner input = new Scanner(System.in);

        String nombre = input.nextLine();
        System.out.println("Contacto " + nombre+" ingresado exitosamente!!\n");

        // closing the scanner object
        
        
        Scanner inpt = new Scanner(System.in);
        
        System.out.println("Escribe la edad de "+nombre+"\n");
        int edad = inpt.nextInt();
        System.out.println("Contacto " + nombre+" ingresado exitosamente!!\n");

        // closing the scanner object
        
    }

    public static void main(String[] args) {
            
        while(true){
            
            ClsMain.recogeContacto();
            
        }
        
    }
    
}

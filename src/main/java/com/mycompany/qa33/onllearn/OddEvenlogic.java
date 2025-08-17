/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.qa33.onllearn;
import java.util.Scanner;

/**
 *
 * @author anatolii.zhukovich
 */
public class OddEvenlogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
         useScanner();
    }
    
public static void useScanner(){
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    
    if (number %2 == 0){
        System.out.println("Even");
    } else {
            System.out.println("Odd");
    }
    
            

}
    
}

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
public class Yearifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
         useScanner();
    }
    
public static void useScanner(){
    Scanner input = new Scanner(System.in);
    int month = input.nextInt();
    
    if (month == 12 || month == 1 || month == 2){
        System.out.println("Winter");
    } else if (month == 3 || month == 4 || month == 5){
             System.out.println("Spring");
    } else if (month == 6 || month == 7 || month == 8){
             System.out.println("Summer");
    }  else if (month == 9 || month == 10 || month == 11){
             System.out.println("Autumn");
    } else {
            System.out.println("No Month like This!");
    }
    
            

}
    
}

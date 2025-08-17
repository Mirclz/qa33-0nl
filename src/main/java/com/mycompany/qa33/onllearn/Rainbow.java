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
public class Rainbow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
         useScanner();
    }
    
public static void useScanner(){
    Scanner input = new Scanner(System.in);
    int colour = input.nextInt();
    
    switch (colour){
        case 1:
            System.out.println("Red");
            break;
        case 2:
            System.out.println("Orage");
            break;
        case 3:
            System.out.println("Yellow");
            break;
        case 4:
            System.out.println("Green");
            break;
        case 5:
            System.out.println("Cyan");
            break;
        case 6:
            System.out.println("Blue");
            break;
        case 7:
            System.out.println("Violet");
            break;
            default:
        System.out.println("No more colours!");
    } 
    
            

}
    
}

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
public class NewMain {

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
    
    switch (month){
        case 12:
        case 1:
        case 2:
            System.out.println("Winter");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Spring");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Summer");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Autumn");
            break; 
            default:
        System.out.println("Mo month like this!");
    } 
    
            

}
    
}

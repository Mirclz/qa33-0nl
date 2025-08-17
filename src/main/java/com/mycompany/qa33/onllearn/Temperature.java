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
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
         useScanner();
    }
    
public static void useScanner(){
    Scanner input = new Scanner(System.in);
    int temperature = input.nextInt();
    
    if (temperature > -5){
        System.out.println("Warm");
    } else if(temperature <= -5 && temperature > -20) {
            System.out.println("Suitable");
    } else if(temperature <= -20 ){
           System.out.println("Freezing");
}
    
            

}
    
}

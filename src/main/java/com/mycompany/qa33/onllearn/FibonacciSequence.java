/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qa33.onllearn;

/**
 *
 * @author anatolii.zhukovich
 */
public class FibonacciSequence {
     public static void main(String[] args) {
    int a = 0;
    int b = 1;
    int sum = 0;
    int count = 0;
 while (count < 11){ 
    System.out.println(b);
    sum = a + b;
    a = b;    
    b = sum;
    count = count +1;
}
}
}
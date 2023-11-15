/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author jiaqi
 */
import java.util.Scanner;
public class L4Q1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        for (int i =1; i<num;i++){
            if (num%i==0){
                if (i==1)
                    System.out.print("The factors are: ");
                System.out.print(i + ", ");
            }
        }
        System.out.println(num);
    }
}

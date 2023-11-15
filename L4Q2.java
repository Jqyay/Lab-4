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
public class L4Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to be summed :");
        int num = sc.nextInt();
        int sum =0;
        for (int i=1, k=1;i<=num;i++, k++){
            if (i<2){
                sum+=i;
            }
            
            else{
                for (int j=1;j<=i;j++){
                sum+=j;
                }
            }
        }
        System.out.println("Sum : " + sum);
    }
}

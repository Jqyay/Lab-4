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
public class L4Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, sumSquareX=0, sumX=0, N=0, min= Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        while(true){
            System.out.print("Enter a score [negative score to quit]:");            
            if((num=sc.nextInt())<0)//if use the input statement in if block, the value of the variable can still be used, but for "for" statement, it cannot
                break;
            sumX+= num;
            sumSquareX+= (Math.pow(num, 2));
            N++;
            if (num<min)
                min = num;
            if (num>max)
                max = num;
        }
        double average = sumX/(double)(N);
        double s = (Math.sqrt((sumSquareX-Math.pow(sumX,2)/(double)(N))/(double)(N-1)));
        System.out.format("Minimum Score: %d%n", min);
        System.out.format("Maximum Score: %d%n", max);
        System.out.format("Average Score: %.2f%n", average);
        System.out.format("Standard deviation: %.2f", s);
    }
}

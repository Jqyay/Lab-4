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
public class L4Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double M,P,i,N,C,L,R, totalInt=0;
        System.out.print("Enter principal amount: ");
        P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        N = sc.nextDouble();
        
        M=(P*i/1200)/(1-Math.pow((1+i/1200),-1*N));
        System.out.format("%-1s%8s%s%8s%s%8s%s%8s%s%8s%s%n", "Month", " ","Monthly Payment", " ","Principal", " ","Interest", " ","Unpaid Balance", " ", "Total Interest");
        for (int n =1; n<=12;n++){
            C = M*Math.pow((1+i/1200),-1*(1+N-n));
            L=M-C;
            R = L/(i/1200)-C;
            totalInt+=L;
            System.out.format("%-5d%8s%15.2f%8s%9.2f%8s%8.2f%8s%14.2f%8s%14.2f%n", n," ", M," ",C, " ",L," ",R," ",totalInt);
        }    
    }
}

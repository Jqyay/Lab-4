/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author jiaqi
 */
import java.util.Random;
public class L4Q6_1 {
    public static void main(String[] args){        
        Random rd = new Random();
        int rdm = rd.nextInt(), rand;
        rand = (rdm>0)? rdm:(rdm*(-1));
        System.out.format("Positive random number generated: %d%nThe number of digits of %d = %d", rand,rand, Digit(rand));
    }
    public static int Digit(int rd){
        int digit2=0;
        
        for (;rd!=0;rd/=10)
            digit2++;
        
        return digit2;
    }
}
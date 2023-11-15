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
public class L4Q6 {
    public static void main(String[] args){        
        Random rd = new Random();
        int rdm = rd.nextInt(), rand;
        rand = (rdm>0)? rdm:(rdm*(-1));
        System.out.format("Positive random number generated: %d%nThe number of digits of %d = %d", rand,rand, Digit(rand));
    }
    public static int Digit(int rd){
        int digit=1;
        for (;rd>0;rd/=10){
            if (rd/10>0)
                digit++;
        }        
        return digit;
    }
}
//public class L4Q6 {
//	public static void main(String[] args) {
//		int num = (int)(Math.random() * Integer.MAX_VALUE + 1), digit=0;		
//		System.out.println("Random number = " + num);
//                for(int i = 0; num > 0; num /= 10, i++) {
//			digit += (num%10>=0)?1:0;
//                        System.out.println(digit);
//			System.out.printf("%15d = %d\n", (1 * (int) Math.pow(10, i)), digit);
//		}
//                System.out.println(digit);
//	}
//}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author jiaqi
 */
import java.util.ArrayList;
public class L4Q8 {
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList();
        for (int k=0;k<=100;k++)
            arr.add(k);
        for (int n=0; n<=100;n++){
            for (int i =2; i<=Math.sqrt(n);i++){
                if (n%i==0){                   
                    arr.remove( arr.indexOf(n));
                    break;
                }
            }
        }
        arr.remove(0);
        arr.remove(0);
        for (int m: arr)
            System.out.format("%d ", m);
    }
}

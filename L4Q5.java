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
public class L4Q5 {
    public static void main(String[] args){
        Random rd = new Random();
        for (int i=1,player1, sumPlayer1= 0,player2, sumPlayer2=0;sumPlayer1<100 && sumPlayer2<100;i++){           
            player1 = rd.nextInt(6)+ 1;
            player2 = rd.nextInt(6)+ 1;
            System.out.format("Round %d%nPlayer1 = %d%n", i,player1);
            sumPlayer1+=player1;
            sumPlayer2+=player2;
            while (player1==6){
                player1 = rd.nextInt(6)+ 1;
                System.out.format("Player1 = %d%n", player1);
                sumPlayer1+=player1;
            }
            
            System.out.format("Player2 = %d%n", player2);
            while (player2==6){
                player2 = rd.nextInt(6)+ 1;
                System.out.format("Player2 = %d%n", player2);
                sumPlayer2+=player2;
            }
            System.out.format("Accumulated points for Player 1: %d%n", sumPlayer1);
            System.out.format("Accumulated points for Player 2: %d%n%n", sumPlayer2);
            
            if(sumPlayer1>=100 &&sumPlayer2>=100){
                if(sumPlayer1>sumPlayer2)
                    System.out.println("Player 1 wins");
                else if(sumPlayer2>sumPlayer1)
                    System.out.println("Player 2 wins");
                else                   
                    System.out.println("Player 1 and Player have the same accumulated points.");
            }
            else if (sumPlayer1>=100){             
                System.out.println("Player 1 wins");
                break;
            }
            else if (sumPlayer2>=100){
                System.out.println("Player 2 wins");
                break;
            }        
        }
    }
}



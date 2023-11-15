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
public class L4Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year, day;
        boolean leapYear;
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        System.out.println("0 for Sunday, 1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday and 6 for Saturday");
        System.out.print("Enter the first day of the year:");
        day = sc.nextInt();
        sc.close();
        System.out.println();
        leapYear = year%4==0;
        int[]daysMonth = {31,(leapYear?29:28),31,30,31,30,31,31,30,31,30,31};
        displayMonth(year, 5, day, daysMonth);
        displayMonth(year,8, day,daysMonth);        
    }
    public static void displayMonth(int year, int month, int a, int[] daysMonth){
        String[] nameMonth = {"", "January","February","March","April","May","June","July","August","September","October","November","December"};  
        String formatted = String.format("%s %d%n", nameMonth[month],year);
        System.out.format("%"+(28-((28-formatted.length())/2))+"s",formatted);
        int sumDays=a, firstDayMonth, sumLoop=0;
        for (int i=0; i<month-1;i++)
            sumDays+=daysMonth[i];
        firstDayMonth = sumDays%7;
        System.out.format("%4s%4s%4s%4s%4s%4s%4s%n", "Sun","Mon","Tue", "Wed", "Thu","Fri","Sat");
        String[] date = new String[daysMonth[month-1]];
        for (int i =1;i<=daysMonth[month-1];i++)
            date[i-1]= String.valueOf(i); 
        String[] space = new String [firstDayMonth];
        for (int i =0;i<space.length;i++)
            space[i]=" ";
        String[][] dateMonth = {space,date};
        for (int i=0;i<dateMonth.length;i++){
            for(int j=0;j<dateMonth[i].length;j++, sumLoop++){
                if (sumLoop%7==0&&(sumLoop>=7))
                    System.out.println();
                System.out.format("%4s",dateMonth[i][j]);
            }
        }
        System.out.println("\n");
    }
}

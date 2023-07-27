/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.p_project1;

/**
 *
 * @author Prarthana
 */
import java.util.Random;
import java.util.Scanner;
class Check{
    int b;

    int a;

    Check(int a,int b){
        this.a=a;
        this.b=b;
    }
    void finding(){

         if(b>a){
             System.out.println("\t\nyour answer is greater,\n\tTry again");
         }
         else if (b<a) {
             System.out.println("\t\nyours answer is smaller,\n\tTry again");
         }
         else{
             System.out.println("\t\nyours answer matched,\n\t you wonnnnnn!!!!!!!!!!!");
         }
        System.out.println("==================================================");
    }
}
public class NumberGuessingGame {
    Scanner sc=new Scanner((System.in));
    Random r= new Random();
    void game(){

        int a=r.nextInt(1,100);
        boolean c=true;
        int i=1;
        int score=100;
        while(c){
            System.out.println("entre the no.");
            int b = sc.nextInt();
            Check obj = new Check(a,b);
            obj.finding();
//            c= obj.a != obj.b;
            if(obj.a==obj.b){
                c=false;
                break;
            }
            else{
                c=true;
            }
            i++;
            score-=15;
            if(i>5){
                System.out.println("No more attempts");
                System.out.println("=====you lose the game=====");
                break;
            }
           
            
        }
        System.out.println("*your total score:"+score);
        System.out.println("*how many attempt you have taken:"+(i-1));
    }
    public static void main(String[] args) {
        System.out.println("=====================Game Started====================");
        System.out.println("========================rules========================");
        System.out.println("*you have only 5 attemps to guess the number else you will lose");
        System.out.println("*total score is 100 for each wrong attempt you will lose 10 points");
        NumberGuessingGame obj=new NumberGuessingGame();
        obj.game();

        boolean i=true;
        while(i) {
            System.out.println("===============================================");
            System.out.println("do you wanna play again \t \nif yes(y/Y):");
            String d = obj.sc.next();
            if (d.equals("y") || d.equals("Y") ) {
                obj.game();
                i=true;
            } else {
                System.out.println("Completed");
                i=false;
            }
        }

    }

}


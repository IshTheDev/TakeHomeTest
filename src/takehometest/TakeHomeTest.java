/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takehometest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ishaan,Duvish,and Aydan
 */
public class TakeHomeTest {
    private static Object numbers;
    private static List<Double> myList = new ArrayList();
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter A Integer: ");
        int n = reader.nextInt();
        for(int i = 0; n >= i; i++) {
            System.out.println(i);
        }
        System.out.println("Enter Another One: ");
        int input = reader.nextInt();
        if(input >= 0) {
            double x;
            x = MathFunctions.SquareRootAndAddThree(input);
            System.out.println(x);
            
             
             if(x>=0){
            myList.add(x);       
        }
             else{
             myList.remove(x);}
        double sum=0;
        for (Double l : myList) {
            sum= sum + l;}
            System.out.println("The Sum Is:" + sum);
   
}
}
}


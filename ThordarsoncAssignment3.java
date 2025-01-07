package com.mycompany.thordarsoncassignment3;

// Programmer name: Chelsea Thordarson
// Thordarsoncassignment3.java
// Assignment 3
/* Assignment3 asks users to input 2 strings, measures the length og the strings, concatinates the 2 strings, compares the 2 strings*/
import java.util.Scanner;

public class ThordarsoncAssignment3 
{

    public static void main(String[] args) 
    
    {
        Scanner input = new Scanner(System.in); //create scanner
        
        System.out.print("Please enter a string \"S1\": "); //user enters string
        String s1 = input.nextLine(); // assignt s1 to input
        System.out.print("Please enter another string \"S2\": "); //user enters string
        String s2 = input.nextLine(); // assignt s2 to input 
        
        int s1Length = s1.length(); // assign integer to variable s1
        int s2Length = s2.length(); // assign integer to variable s2
        
        System.out.println("The length of S1 is " + s1Length + " and the length of S2 is " + s2Length + "."); // print lengths
        
        System.out.println("The first character of S2 is " + s2.substring(0,1) + "."); // print index 0
        
        System.out.println(s1 + " " + s2); //concatinate s1 and s2 with added space in between
        
        String s3 = s2.toUpperCase(); // assign uppcase s2 to s3
        System.out.println(s3); //print s2 as uppercase or simply System.out.println(s2.toUpperCase());
        
        if (s1.equalsIgnoreCase(s2)) //if s1 is equal to s2 regardless of casing
            System.out.println("S1 and S2 are equal"); //if equal print
        else
            System.out.println("S1 and S2 are not equal");// if not equal print
        
        int firstIndex = s2.indexOf(s1); //assign integer to variable indexing s1 from s2
        
        if (firstIndex <= -1) //-1 means no match
            System.out.println("S1 is not a substring of S2"); // index returned -1
        if (firstIndex > -1) // index returned match
            System.out.println("S1 is a substring of S2"); //index was >-1
            
        }
       
    
}

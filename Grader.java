/**
*  Calculates the grade a student receives on an examination
*
*  The program first prompts the user to enter the number of points possible
*  on the exam.  Then, the program prompts for the number of items missed; if a positive
*  number is entered, the program responds by calculating and displaying the percentage
*  score out of 100.  If a negative number is entered, the program prints a "Thank You" message
*  and exits.
*  
*  A sample interaction might be: (user input marked with '>')
*  "Enter the number of items on the exam"
*  >25
*  "Enter the number of items missed"
*  >3.5
*  "Missing 3.5 results in a score of 86.0"
*  "Enter the number of items missed"
*  >0
*  "Missing 0 results in a score of 100.0"
*  "Enter the number of items missed"
*  >-100
*  "Thank you -- have a great day!"
*  
*///by Alexander Ferragamo

import java.util.Scanner;

public class Grader{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double num3 = 0;
      double num2 = 0;

      System.out.println("Hello, This program is created to tell you your grade on a quiz or test.");
      System.out.println("Any time you would like to quit imput any negivitve number.");
      System.out.println("Please type in the over all points of the test or quiz.");
      double num1 = scnr.nextDouble();
      while (num2 >= 0){
      System.out.println("Enter the number of points taken off");
      num2 = scnr.nextDouble();
      num3 = (num1 - num2) / num1;
      if (num2 >= 0){
      System.out.println("Getting "+num2 +" points off the quiz gives you a score of "+num3 +"%");
      }
      }
      System.out.println("Thank you, Have a nice day");
      }
      }

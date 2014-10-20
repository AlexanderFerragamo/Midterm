/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <Alexander Ferragamo>
 */
import java.util.Scanner;

public class PizzaPalace{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double totalPizzas = 0;
      
      System.out.println("This is a code used to figur out how may pizzas are needed depending on how many people there are.");
      System.out.println("First you need to tell me how many people will be at your club.");
      double numPeople = scnr.nextDouble();
         if (numPeople >= 20){
         System.out.println("Wow! that is a lot of people.");
         } else if (numPeople >= 10){
         System.out.println("Thats is a good amount of people!");
         } else if (numPeople < 10){
         System.out.println("Wow! That is not a lot of people.");
         }
      System.out.println("Now you need to tell me how many slices of pizza each person will have.");
      double numSlices = scnr.nextDouble();
         if (numSlices >= 5){
         System.out.println("Wow, these people are really hungry");
         } else if (numSlices >= 3){
         System.out.println("That seems like a good amount of pizza per person.");
         } else if (numSlices <= 2){
         System.out.println("Wow, these people are not very hungry.");
         }
      System.out.println("Now you need to tell me how many slices are in each pizza.");
      int numPer = scnr.nextInt();
      totalPizzas = (numPeople * numSlices) / numPer;
      totalPizzas = Math.ceil(totalPizzas);
      System.out.println("You need "+totalPizzas +" pizzas."); 
      
      
      }
      
 }
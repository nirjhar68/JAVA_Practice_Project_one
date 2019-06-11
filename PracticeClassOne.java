/*Muhammad Nuhel Nawaz Chowdhury
* Computer programming and Development
* June 10, 2019*/

import java.util.*;
public class PracticeClassOne {
    // Hello, This is a practice project.
    // Here I am going to discuss the basics of writhing a program with Injelij in JAVA
    /*I have imported the JAVA package util and everything inside the package. To select all that's inside the specific
    package, that contains a group of classes, I used *
     */
    // In this project, I will demonstrate how to write a simple program that adds two variables and gives the result
    //This is the method that adds two variables and returns nothing. It accepts two variable from the main method
    //Since I am not using the variables by reference, I will be using them by values
    /*I will the keyword static at the beginning of the method so that i can use this method without creating any instance
    of the class*/
    static void addition(int a, int b){
        int result = a+b;
        System.out.println(result);
    }

    //The Execution of the program starts here
    public static void main(String [] arg){
        //declare two variables
        int a;
        int b;
        //Now we need to create a Scanner object to read the user inputs from the console
        Scanner input = new Scanner(System.in);
        //Declare some boolean variable
        boolean flag = false;
        boolean isInteger = false;
        //Keep looping the method until the user exits
        System.out.println("Welcome to JAVA practice!!\n");
        do{
            System.out.println("Enter the variables\n");
            do{
                if(input.hasNextInt()){
                    //And the boolean variable becomes true
                    isInteger = true;
                    a = input.nextInt();
                    b = input.nextInt();
                    addition(a,b);
                }else{
                    isInteger = false;
                    System.out.println("Please enter a valid integer!");
                    //Now we have to clear whatever value was stored in scanner
                    //If we don't clear the scanner, the code will start an infinite loop
                    //Because everytime the condition will see invalid values in the scanner and set the condition false
                    input.next();
                }
            }while(!isInteger);
            System.out.println("Do you wish to try again? Press Y or N\n");
            if(input.hasNext("n") || input.hasNext("N")){
                flag = true;
                System.out.println("Thanks for trying!\n " + "See you next time..");

            }else{
                flag = false;
            }
        }while(!flag);


    }
}

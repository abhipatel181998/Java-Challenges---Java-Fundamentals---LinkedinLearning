/**
 * @author: Abhi Patel
 * Program to simulate multiple choise test senario.
 * LinkedinLearning: https://www.linkedin.com/learning/learning-java-4/challenge-multiple-choice?autoplay=true&contextUrn=urn%3Ali%3AlyndaLearningPath%3A56d8919392015a1a081f9141&resume=false&u=2218586
 */

import java.util.Scanner;

public class MultipleChoise {

    public static void main(String args[]) {
        String question = "What is the capital of India?";
        String choiceOne = "Mumbai";
        String choiceTwo = "Delhi";
        String choiceThree = "Kolkata";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("a. "+choiceOne);
        System.out.println("b. "+choiceTwo);
        System.out.println("c. "+choiceThree);
       
        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        System.out.print("Please enter your answer: ");
        String answer = input.nextLine();
       
        // If the user's input matches the correctAnswer...
        if(answer.equalsIgnoreCase(correctAnswer))
        // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Congratulation. Correct answer.");
        // If the user's input does not match the correctAnswer...
        else
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Sorry the correct answer is b. "+choiceTwo);
        
            input.close();
    }
}
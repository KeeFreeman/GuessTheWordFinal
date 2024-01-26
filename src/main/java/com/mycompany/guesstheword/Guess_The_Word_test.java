/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guesstheword;

import java.util.Scanner;

/**
 *
 * @author Keegan
 */
public class Guess_The_Word_test {

    //method
    private static void playgame(){
    
    //scanners
        Scanner scanner = new Scanner(System.in);
        
        //word and ints
        String secretWord = "mouse";
        int maxAttempts = 5;
        int attempts = 0;

        //imidiate string outputs
        System.out.println("Welcome to Guess the Word!");
        System.out.println("Guess the secret word in " + maxAttempts + " attempts.");
        System.out.println("Hint: the word is a common item in our class! (all lowercase!)");

        //retry input
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();
            
            //word guess
            if (guess.equals(secretWord)) {
                System.out.println("Congratulations! You guessed the secret word.");
                break;
                
                //atempts++
            } else {
                attempts++;
                int correctLetters = 0;

                //correct letters 
                for (int i = 0; i < guess.length(); i++) {
                    if (secretWord.contains(String.valueOf(guess.charAt(i)))) {
                        correctLetters++;
                    }
                }
                //incorect guess
                System.out.println("Incorrect guess. " + correctLetters + " letters are in the correct position.");
                System.out.println("You have " + (maxAttempts - attempts) + " attempts remaining.");
            }
        }
        //loss
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you couldn't guess the secret word. Try again");
        }
        //close
        scanner.close();
    }
    
    //method
    public static void main(String[] args) {
        //method
        playgame();
    }
}
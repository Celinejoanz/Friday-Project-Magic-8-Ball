package com.company;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String question;
        String question2="";
        String answer3="";
        question = scan.nextLine();
        System.out.println("YOU ASKED: " + question);
        Random generate = new Random();
        String[] answer = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};
        System.out.println("MAGIC 8-BALL SAYS: " + answer[generate.nextInt(20)]);
        String answer1;
        String answer2;
        answer1 = "yes";
        answer2 = "no";
        System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
        String word;
        word = scan.nextLine();
        //.next_line : this ensures that the computer does not use "space" or "enter" (which it saved in the keyboard buffer from your previous entry) as its requested question when it requests it. So it actually prompts you for the next question

        while (word.equals(answer1))
        {
            System.out.println("Enter your question: ");
            question2 = scan.nextLine();
            System.out.println("YOU ASKED: " + question2);
            String[] next_answer = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};
            System.out.println("MAGIC 8-BALL SAYS: " + next_answer[generate.nextInt(20)]);
            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            answer3 = scan.nextLine();
        }
        System.out.println("Goodbye");

    }
}

package ru.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import java.io.BufferedReader;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class BullsAndCows {

    private static final Logger LOGGER = (Logger) LogManager.getLogger();

    public static void main(String[] args) {

        System.out.println("Welcome to Bulls and Cows game!");
        LOGGER.info("Logger started!");

        while (playGame());

    }

    public static boolean playGame() {

        Scanner in = new Scanner(System.in);
        int [] bullsAndCows;
        String userSting = "";
        Random random = new Random();
        int countOfAttempt = 10;
        //String word = "java"; 
        String word = getWordFromFile(random.nextInt(52976));

        //System.out.println("I offered a " + word.length() + "-letter word, your guess?");
        LOGGER.info("I offered a " + word.length() + "-letter word, your guess?");

        for (int i = 0; i < countOfAttempt; i++) {
            userSting = in.nextLine();

            if (userSting.length() != word.length()) {
                LOGGER.info("Wrong word length! Launch a new game!");
                return true;
            }

            bullsAndCows = checkBullsAndCows(userSting, word);

            if (bullsAndCows[0] == word.length()) {
                LOGGER.info("You won!");
                i = countOfAttempt - 1;
            } else {
                LOGGER.info("Bulls: " + bullsAndCows[0] + ";  Cows: " + bullsAndCows[1]);
                if (i == countOfAttempt - 1)
                    LOGGER.info("You lose! Word is: " + word);
            }

            if (i == countOfAttempt - 1) {
                System.out.println("Wanna play again? yes/no");
                if (in.nextLine().equals("yes")) {
                    return true;
                }
            }
        }
        in.close();
        return false;
    }

    public static String getWordFromFile(int rand) {

        ArrayList<String> list = new ArrayList<>();
        String str = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"))) {
            while ((str = reader.readLine()) != null) {
                if (!str.isEmpty()) {
                    list.add(str);
                }
            }
        }
        catch (IOException ex) {
            System.out.println("Error reading file!");
        }

        str = list.get(rand);

        return str;
    }

    public static int [] checkBullsAndCows(String userString, String word) {

        int [] bullsAndCows = new int [2];
        for (int i = 0; i < word.length(); i++) {
            if (userString.charAt(i) == word.charAt(i)) {
                bullsAndCows[0]++;
            } else {
                if (word.contains(Character.toString(userString.charAt(i))))
                    bullsAndCows[1]++;
            }
        }
        return bullsAndCows;
    }
}
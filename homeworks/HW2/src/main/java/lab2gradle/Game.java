package lab2gradle;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static int cow(String word, String userWord)
	{
		int out = 0;
		for(int i = 0; i < word.length(); i++)
			for(int j = 0; j < word.length(); j++)
				if(word.charAt(i) == userWord.charAt(j) && i != j)
					out++;
		return out;
	}
	
	public static int bull(String word, String userWord)
	{
		int out = 0;
		for(int i = 0; i < word.length(); i++)
			if(word.charAt(i) == userWord.charAt(i))
				out++;
		return out;
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		
		Random rand = new Random();
		String strs[] = new String[50000];
		int strNum = rand.nextInt(50000);
		try {
			Scanner file = new Scanner(new FileInputStream("../../../../dictionary.txt"));
			for(int i = 0; i < 50000; i++)
				strs[i] = file.next();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String word = strs[strNum];
		//String word = "atom";
		int i = 0;
		int max = 10;
		String userWord = "";
		System.out.println(word);
		do {
			System.out.println("Введите слово из "+word.length()+" букв:");
			userWord = in.next();
			System.out.print("Быков: ");
			System.out.println(bull(word, userWord));
			System.out.print("Коров: ");
			System.out.println(cow(word, userWord));
			
			
		}while(word != userWord && i < max);
		
		if(word == userWord)
			System.out.println("Слово угадано!");
		else
			System.out.println("Слово не угадано!");
		
		in.close();
	}
}

package gC_Capstone_01;

import java.util.Scanner;

public class gC_Capstone_01 {

	public static void main(String[] args) {

		String userInput;
		String keepGoing = "y";

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to The Swine Language System (S.L.S)");
		System.out.println("\n");
		while (keepGoing.equalsIgnoreCase("y")) {
			System.out.println("Enter a word.");
			userInput = scnr.nextLine();
// changes to lower case before translating
			String lcWord = userInput.toLowerCase();
// if a word starts with a vowel add "way"

			if (lcWord.startsWith("a") || lcWord.startsWith("e") || lcWord.startsWith("i") || lcWord.startsWith("o")
					|| lcWord.startsWith("u")) {
				System.out.println(lcWord + "way");
			}
// if word starts with a consonant move all consonants before the first vowel to the end of the word and then add AY to the end. 

			if (!(lcWord.startsWith("a") || lcWord.startsWith("e") || lcWord.startsWith("i") || lcWord.startsWith("o")
					|| lcWord.startsWith("u"))) {

				int firstVowelIndex = indexOfFirstVowel(lcWord);
				// System.out.println(firstVowelIndex);
				String beforeVowel = lcWord.substring(0, firstVowelIndex);
				String afterVowel = lcWord.substring((firstVowelIndex), (lcWord.length()));

				String pigLatinWord = afterVowel + beforeVowel + "ay";
				System.out.println(pigLatinWord.substring(0, 1).toUpperCase() + pigLatinWord.substring(1));
				System.out.println("\n");
				System.out.println("Still enjoying the fun? \n Press Y to continue or any other key exit S.L.S.");
				keepGoing = scnr.nextLine();
			}
		}

		System.out.println("Thanks for using S.L.S. version 0.0.1b");

		scnr.close();

	}

	final static String vowels = "aeiou";
// method used to find the index of first vowel in the string entered
	
	public static int indexOfFirstVowel(String word) {

		for (int index = 0; index < word.length(); index++) {
			if (vowels.contains(String.valueOf(word.charAt(index)))) {
				return index;
			}
		}
		return 0;

	}
// move characters before first vowel to end of word 	
}

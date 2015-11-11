package homeWork08;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise06_Dictionary {
	private String dictionaryBookName;
	private TreeMap dictionary;

	public Exercise06_Dictionary(String name) {
		setDictionaryBookName(name);
		dictionary = new TreeMap<String, String>();
	}

	public String getDictionaryBookName() {
		return dictionaryBookName;
	}

	public void setDictionaryBookName(String dictionaryBookName) {
		this.dictionaryBookName = dictionaryBookName;
	}

	public TreeMap getDictionary() {
		return dictionary;
	}

	private void addWord(String word, String translationWord) {
		TreeMap<String, String> currentDictionary = this.getDictionary();
		currentDictionary
				.put(word.toLowerCase(), translationWord.toLowerCase());
	}

	private void searchWord(String word) {
		TreeMap<String, String> currentDictionary = this.getDictionary();
		if (currentDictionary.containsKey(word.toLowerCase())) {
			System.out.println(currentDictionary.get(word));
		} else {
			System.out.println("There is no such word");
		}
	}

	public void printDictionary() {
		TreeMap<String, String> currentDictionary = this.getDictionary();
		for (Map.Entry<String, String> wordEntry : currentDictionary.entrySet()) {
			System.out.printf("word '%s' translates  %s %n",
					wordEntry.getKey(), wordEntry.getValue());
		}
	}

	public void userDictionaryMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Please select:");
		System.out.println("1-Enter new word");
		System.out.println("2-Search word");
		System.out.println("3-Exit");
		int menuChoice = scan.nextInt();
		switch (menuChoice) {
		case 1:
			System.out.println("Enter the new word");
			String word = scan.next();
			System.out.println("Enter the translation for: " + word);
			String translationWord = scan.next();
			this.addWord(word, translationWord);
			userDictionaryMenu();
			break;
		case 2:
			System.out.println("Enter the searching word");
			String searchingWord = scan.next();
			this.searchWord(searchingWord);
			userDictionaryMenu();
			break;
		case 3:
			System.out.println("Thank you for using Dictionary 2015");
			break;
		default:
			System.out.println("Please enter number between 1-3");
			userDictionaryMenu();
			break;
		}
	}

}

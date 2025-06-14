package dictionary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
        Scanner scanner = new Scanner(System.in);
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();

        while (true) {
            System.out.println("Give a finnish word: "
                    + "(Enter exits the program.)");
            String finnishWord = scanner.nextLine();
            if (finnishWord.equals("")) {
                break;
            }
            System.out.println("Give the english translation:");
            String englishWord = scanner.nextLine();
            dictionary.add(finnishWord, englishWord);
        }
        
        dictionary.save();
    }
}

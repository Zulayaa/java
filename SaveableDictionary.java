package dictionary;

import java.util.List;
import java.util.ArrayList;
import dictionary.Translation;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class SaveableDictionary {

    private List<Translation> tempDictionary;
    private File dictionary;

    public SaveableDictionary() {
        this.tempDictionary = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this.tempDictionary = new ArrayList<>();
        this.dictionary = new File(file);
    }

    public void add(String words, String translation) {
        this.tempDictionary.add(new Translation(words, translation));
    }

    public String translate(String word) {
        for (Translation t : tempDictionary) {
            if (t.getEnglish().equalsIgnoreCase(word)) {
                return t.getFinnish();
            } else if (t.getFinnish().equalsIgnoreCase(word)) {
                return t.getEnglish();
            }
        }
        return null;
    }

    public void delete(String word) {
        Iterator<Translation> iterator = tempDictionary.iterator();
        while (iterator.hasNext()) {
            Translation t = iterator.next();
            if (t.getEnglish().equalsIgnoreCase(word)
                    || t.getFinnish().equalsIgnoreCase(word)) {
                iterator.remove();
            }
        }
    }

    public boolean load() {
        try ( Scanner fileReader = new Scanner(this.dictionary)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String finnish = parts[0].trim();
                    String english = parts[1].trim();
                    this.tempDictionary.add(new Translation(finnish, english));
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println("You idiot... " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.dictionary)) {
            for (Translation t : this.tempDictionary) {
                writer.println(t.getFinnish() + ":" + t.getEnglish());
            }
            return true;
        } catch (Exception e) {
            System.out.println("You're and idiot again... " + e.getMessage());
        }
        return false;
    }
}

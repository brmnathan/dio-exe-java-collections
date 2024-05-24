package set.basicSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Dictionary {
    Set<Word> dictionary;

    public Dictionary() {
        this.dictionary = new HashSet<>();
    }

    public void addWord(Word word) {
        dictionary.add(word);
    }

    public void removeWord(String word) {
        if (dictionary.isEmpty())
            throw new DictionaryException("Dictionary is empty!");
        else
            dictionary.removeIf(w -> w.getWord().equalsIgnoreCase(word));
    }

    public void displayWord(String word) {
        if (dictionary.isEmpty())
            throw new DictionaryException("Dictionary is empty!");
        else {
            boolean wordFound = false;
            for (Word w : dictionary) {
                if (w.getWord().equalsIgnoreCase(word)) {
                    System.out.println(w);
                    wordFound = true;
                    break;
                }
            }
            if (!wordFound) {
                throw new DictionaryException("Word not found");
            }
        }
    }

    public void displayDictionary() {
        Set<Word> alphabetDictionary = new TreeSet<>(dictionary);
        if (dictionary.isEmpty())
            throw new DictionaryException("Dictionary is empty!");
        else
            alphabetDictionary.forEach(System.out::println);
    }

}

package map.basicMap;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public void removeWord(String word) {
        dictionary.remove(word);
    }

    public void displayDictionary() {
        if (dictionary.isEmpty())
            throw new DictionaryException("The dictionary is empty!");
        else
            System.out.println(toString());
    }

    public String searchWord(String word) {
        String definition = dictionary.get(word);
        if (dictionary.isEmpty())
            throw new DictionaryException("The dictionary is empty!");
        if (definition == null)
            throw new DictionaryException("Word not found!");
        else
           return word + ": " + definition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}

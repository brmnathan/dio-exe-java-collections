package set.basicSet;

public class Program {
    public static void main(String[] args) {
        Word word1 = new Word("Ephemeral", "Lasting for a very short time.");        Word word2 = new Word("Apple", "A round fruit with red or green skin and a whitish interior.");
        Word word3 = new Word("Elephant", "A large mammal with a long trunk, large ears, and tusks, native to Africa and parts of Asia.");
        Word word4 = new Word("Sunshine", "The light and heat that come from the sun.");
        Word word5 = new Word("Adventure", "An exciting or unusual experience.");
        Word word6 = new Word("Serendipity", "The occurrence of events by chance in a happy or beneficial way.");
        Word word7 = new Word("Wanderlust", "A strong desire to travel and explore the world.");
        Word word8 = new Word("Harmony", "The combination of simultaneously sounded musical notes to produce chords and chord progressions having a pleasing effect.");
        Word word9 = new Word("Tranquility", "The quality or state of being calm and peaceful.");
        Word word10 = new Word("Enigma", "A person or thing that is mysterious, puzzling, or difficult to understand.");

        Dictionary dictionary = new Dictionary();

        //Add words
        dictionary.addWord(word1);
        dictionary.addWord(word2);
        dictionary.addWord(word3);
        dictionary.addWord(word4);
        dictionary.addWord(word5);
        dictionary.addWord(word6);
        dictionary.addWord(word7);
        dictionary.addWord(word8);
        dictionary.addWord(word9);
        dictionary.addWord(word10);
        //Remove word
        dictionary.removeWord("Wanderlust");
        //Display word
        dictionary.displayWord("Ephemeral");
        //Display dictionary
        dictionary.displayDictionary();
    }
}

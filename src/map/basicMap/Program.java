package map.basicMap;

public class Program {
    public static void main(String[] args) {

        try {
            Dictionary dictionary = new Dictionary();

            //Add words
            dictionary.addWord("hello", "used as a greeting or to begin a conversation");
            dictionary.addWord("world", "the earth, together with all of its countries and peoples");
            dictionary.addWord("computer", "an electronic device for storing and processing data");
            dictionary.addWord("book", "a written or printed work consisting of pages glued or sewn together along one side and bound in covers");
            dictionary.addWord("cat", "a small domesticated carnivorous mammal with soft fur, a short snout, and retractile claws");
            dictionary.addWord("dog", "a domesticated carnivorous mammal that typically has a long snout, an acute sense of smell, and a barking, howling, or whining voice");
            dictionary.addWord("house", "a building for human habitation, especially one that consists of a ground floor and one or more upper storeys");
            dictionary.addWord("tree", "a woody perennial plant, typically having a single stem or trunk growing to a considerable height and bearing lateral branches at some distance from the ground");
            dictionary.addWord("flower", "the seed-bearing part of a plant, consisting of reproductive organs (stamens and carpels) that are typically surrounded by a brightly colored corolla (petals) and a green calyx (sepals)");
            dictionary.addWord("water", "a colorless, transparent, odorless liquid that forms the seas, lakes, rivers, and rain and is the basis of the fluids of living organisms");
            //Remove word
            dictionary.removeWord("hello");
            //Display dictionary
            dictionary.displayDictionary();
            //Search word
            System.out.println(dictionary.searchWord("computer"));
        }
        catch (DictionaryException e) {
            System.out.println(e.getMessage());
        }
    }
}

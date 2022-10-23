import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;

import java.lang.Math;

public class WordleInputHandler extends WordleEngine {
    private Scanner scanner;
    protected int numGuesses;

    protected static String answer;
    protected String guess;
    protected static ArrayList<String> wordList = new ArrayList<String>();
    protected static DrawWord drawer = new DrawWord();

    WordleInputHandler() {
        scanner = new Scanner(System.in);

        Collections.addAll(wordList, "Bishop", "Beyond", "Castle", "Coffee",
                "Family", "Hudson", "Kermit", "Senior", "Winner");

        setAnswer(selectAnswer(wordList));
        this.guess = "";

    }

    /**
     * <h3>Selects random word from arr</h3>
     * 
     * @param words
     * @return a random word
     */

    public static String selectAnswer(ArrayList<String> words) {

        int randomIndex = ((int) (Math.random() * (words.size() - 1) + 1));

        return words.get(randomIndex).toLowerCase();
    }

    /**
     * sets guess based on inputted user
     */
    public void setGuess() {

        while (this.guess.length() != 6) {
            System.out.println("Please enter a SIX letter word: ");
            this.guess = (scanner.nextLine()).toLowerCase();
        }

    }

    /**
     * Sets answer based on returned word in wordList
     * 
     * @param selectedWord
     */

    public static void setAnswer(String selectedWord) {
        answer = selectAnswer(wordList);
        System.out.println("The Answer: " + answer);
    }

    public String getAnswer() {
        return answer;
    }

    public static String getInputAnswer() {
        return answer;
    }

    /**
     * Resets guess to empty string
     */

    public void resetGuess() {
        this.guess = "";
    }

    public String getGuess() {

        return this.guess;
    }

}


import java.util.ArrayList;

import javax.swing.*;

public class Utility {

    public static JButton getElementsJButton(JButton[] arr) {
        for (JButton JButton : arr) {

            return JButton;
        }
        return new JButton();

    }

    public static char getElementsString(String string) {
        for (char letter : string.toCharArray()) {

            return letter;
        }
        return '\u0000';

    }

    public static void sleepThread(int seconds) {
        try {
            Thread.sleep((long) seconds * 1000);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + 1);

    }

    public static int getRandomStringIndex(String word) {
        return (int) (Math.random() * (word.length() - 1) + 1);

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

}


import javax.swing.*;

public class Utility {

    public static JButton getElementsJButton(JButton[] arr) { // Dont use {} if only one line of code afterwards
        for (JButton JButton : arr) {

            return JButton;
        }
        return new JButton();

    }

    public static char getElementsString(String string) { // Dont use {} if only one line of code afterwards
        for (char letter : string.toCharArray()) {

            return letter;
        }
        return '\u0000';

    }

    public static void sleepThread(int seconds) { // It is a REALLY bad practive to freeze your thread. Only do it if you have a seberat thread
        try {
            Thread.sleep((long) seconds * 1000);

        } catch (Exception e) { // if exeption isn't handled, call the exption "ignored" -> catch (Exeption ignored) { }
            // TODO: handle exception
        }
    }

}

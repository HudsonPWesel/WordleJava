import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class DrawWord extends WordleInputHandler {

    private int greenCounter = 0;

    /**
     * <h4>Using numGuesses from WordleInputHandler, method determines what buttons
     * to
     * put in current row>
     * 
     * @return Sublist of buttons
     */

    public List<JButton> getRowCells() {
        // Based on number return certain part of ArrayList

        switch (super.numGuesses) {

            case 1:

                return WordleFrameDrawer.getButtons().subList(0, 6);

            case 2:
                greenCounter = 0;
                return WordleFrameDrawer.getButtons().subList(6, 12);

            case 3:
                greenCounter = 0;

                return WordleFrameDrawer.getButtons().subList(12, 18);

            case 4:
                greenCounter = 0;

                return WordleFrameDrawer.getButtons().subList(18, 24);

            case 5:
                greenCounter = 0;

                return WordleFrameDrawer.getButtons().subList(24, 30);

            default:
                return WordleFrameDrawer.getButtons();

        }

    }

    /**
     * <h3>Gives hints on letters inputted with colors
     * 
     * @param guess
     */

    public void hintGiver(String guess) {

        // Prints letter to user
        if (numGuesses == 3) {
            System.out.println("Here is a helpful hint!");
            Utility.sleepThread(1);
            int randomIndex = Utility.getRandomStringIndex(getAnswer());
            char hintLetter = getAnswer().charAt(randomIndex);
            System.out.println("The letter " + "\"" + hintLetter + "\"" + " is at position " +
                    (randomIndex + 1) + " in the word");
        }
        for (JButton btn : getRowCells()) {

            // Check for green note btn.getText gives one String lette
            // Get character at the index of the Arraylist of buttons

            if (btn.getText().equals(Character.toString(answer.charAt(getRowCells().indexOf(btn))))) {

                changeCellBgColor(btn, Color.green);
                greenCounter++;
                if (greenCounter == 6) {
                    winGame();
                }
            }

            // Make sure guess letter is in answer
            else if (answer.contains(btn.getText())) {
                // Make sure it's in wrong pos
                if (!btn.getText().equals(Character.toString(answer.charAt(getRowCells().indexOf(btn))))) {

                    changeCellBgColor(btn, Color.yellow);
                }

            }

            else {
                changeCellBgColor(btn, Color.LIGHT_GRAY);

            }

        }

    }

    // Iterate through sublist of buttons
    // Check if text content of button is either in the right position or letter
    // Set BG Color of button

    public void fillRow(String word) {

        if (numGuesses != 5) {
            numGuesses++;

        } else {
            numGuesses = 0;
        }

        for (int i = 0; i < word.length(); i++) {

            String gridCellLetter = Character.toString(word.charAt(i));

            getRowCells().get(i).setText(gridCellLetter);
        }
        // numGuess is adding all the time becuase ur calling the function too many
        // times

        hintGiver(getGuess());
    }

    /**
     * Creates borders for each cell in cellList
     */
    public void setColorCellBorder() {
        for (JButton button : WordleFrameDrawer.getButtons()) {
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }

    }

    public void changeCellFont() {
        for (JButton button : WordleFrameDrawer.getButtons()) {
            button.setFont(new Font("Dialog", Font.BOLD, 48));
        }
    }

    public void changeCellBgColor(JButton button, Color color) {

        button.setBackground(color);
        button.setOpaque(true);

    }

}

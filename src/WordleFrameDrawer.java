
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import java.awt.Color;

public class WordleFrameDrawer {

    // Why is this Static???? Make A getter instead!
    private static ArrayList<JButton> buttons = new ArrayList<JButton>();

    private JFrame frame = new JFrame();
    private JButton cell;

    private DrawWord drawer = new DrawWord();

    // Public, Protected or Private Constructor???? (Choose Public here)
    WordleFrameDrawer() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Creates UI...

                frame.setLayout(new GridLayout(5, 6));
                frame.setSize(400, 400);
                frame.setVisible(true);

                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            }
        });

    }

    public void addCell(int numLoops) {
        for (int i = 0; i < numLoops; i++) {
            cell = new JButton();
            buttons.add(i, cell);
            WordleFrameDrawer.setButtons(buttons);

            frame.add(cell);
        }

    }

    public JFrame getFrame() {
        return this.frame;
    }

    public static void setButtons(ArrayList<JButton> buttons) {
        WordleFrameDrawer.buttons = buttons;

    }

    public static ArrayList<JButton> getButtons() {

        return WordleFrameDrawer.buttons;
    }

    public DrawWord getDrawer() {
        return this.drawer;
    }
}

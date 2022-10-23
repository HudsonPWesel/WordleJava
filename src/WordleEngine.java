public class WordleEngine {

    public void endGame() {
        System.out.println("Congratulations You Win");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to WordleJava!");
        Utility.sleepThread(1);
        System.out.println("Please wait for the board to draw! Thank You!");

        // ======INIT GAME======
        WordleInputHandler engine = new WordleInputHandler();

        WordleFrameDrawer wordleFrame = new WordleFrameDrawer();

        DrawWord drawer = wordleFrame.getDrawer();

        wordleFrame.addCell(30);

        drawer.setColorCellBorder();

        drawer.changeCellFont();

        // ======RUN GAME======

        for (int i = 0; i < 6; i++) {
            engine.setGuess();
            drawer.fillRow(engine.getGuess());
            engine.resetGuess();
        }

    }
}
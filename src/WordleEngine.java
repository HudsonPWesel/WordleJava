public class WordleEngine {

    public void winGame() {
        Utility.sleepThread(2);
        System.out.println("Congratulations You Win");
        Utility.sleepThread(1);
        System.exit(0);

    }

    /**
     * quits game in case of more than 5 guesses
     */

    public static void endGame() {
        Utility.sleepThread(2);
        System.out.println("Sorry you lose");

        Utility.sleepThread(1);
        System.out.println("The answer was " + WordleInputHandler.getInputAnswer() + "!");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

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

        for (int i = 0; i < 5; i++) {
            engine.setGuess();
            drawer.fillRow(engine.getGuess());
            engine.resetGuess();
            if (i == 4) {
                endGame();
            }
        }

    }
}
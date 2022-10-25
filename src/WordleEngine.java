public class WordleEngine {

    public void endGame() {
        System.out.println("Congratulations You Win");
    }

    public static void main(String[] args) { // Great job, always keep your Main Class organized

        // ======INIT GAME======
        WordleInputHandler engine = new WordleInputHandler();

        WordleFrameDrawer wordleFrame = new WordleFrameDrawer();

        DrawWord drawer = wordleFrame.getDrawer();

        wordleFrame.addCell(30);

        drawer.setColorCellBorder();

        drawer.changeCellFont();

        // ======RUN GAME======

        // 1st Guess
        engine.setGuess();
        drawer.fillRow(engine.getGuess());
        engine.resetGuess();

        // 2nd Guess
        engine.setGuess();
        drawer.fillRow(engine.getGuess());
        engine.resetGuess();

        // 3rd Guess
        engine.setGuess();
        drawer.fillRow(engine.getGuess());
        engine.resetGuess();

        // 4th Guess
        engine.setGuess();
        drawer.fillRow(engine.getGuess());
        engine.resetGuess();

        // 5th Guess
        engine.setGuess();
        drawer.fillRow(engine.getGuess());
        engine.resetGuess();

        // Final Guess
        engine.setGuess();
        drawer.fillRow(engine.getGuess());
        engine.endGame();

    }
}
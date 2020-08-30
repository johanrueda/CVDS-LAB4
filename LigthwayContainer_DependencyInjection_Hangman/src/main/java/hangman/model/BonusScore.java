package hangman.model;

public class BonusScore implements GameScore{
    /**
     * @pre el puntaje inicia en 0
     * @pos el puntaje es mayor o igual a 0
     * @param correctCount puntuacion correcta
     * @param incorrectCount puntacion incorrecta
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}

package hangman.model;

public class OriginalScore implements GameScore{
    /**
     * @pre el puntaje inicia con 100
     * @pos el puntaje mayor o igual a cero
     * @param correctCount puntuacion correcta
     * @param incorrectCount puntacion incorrecta
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}

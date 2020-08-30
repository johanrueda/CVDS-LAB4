package hangman.model;

public class PowerScore implements GameScore{
    /**
     * @pre el puntaje inicia en 0
     * @pos el puntaje es mayor o igual a cero
     * @param correctCount puntuacion correcta
     * @param incorrectCount puntacion incorrecta
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}

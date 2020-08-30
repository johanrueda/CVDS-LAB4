package hangman.model;



public interface GameScore {
    /**
     * @pre
     * @pos
     * @param @correctCount puntuacion correcta
     * @param @incorrectCount puntacion incorrecta
     */
    public int calculateScore(int correctCount,int incorrectCount);
}

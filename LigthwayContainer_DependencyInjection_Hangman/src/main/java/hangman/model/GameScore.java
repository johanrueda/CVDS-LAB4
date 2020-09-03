package hangman.model;



public interface GameScore {
    /**
     * @pre
     * @pos
     * @param @correctCount puntuacion correcta
     * @param @incorrectCount puntacion incorrecta
     * @return
     */
    public int calculateScore(int correctCount, int incorrectCount);
    default int getPuntaje(){
        return 0;
    }
}

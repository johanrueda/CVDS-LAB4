package hangman.model;

public class OriginalScore implements GameScore{
    private int puntaje=100;
    /**
     * @pre el puntaje inicia con 100
     * @pos el puntaje mayor o igual a cero
     * @param correctCount puntuacion correcta
     * @param incorrectCount puntacion incorrecta
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        puntaje = puntaje - (incorrectCount * 10);
        if(puntaje<0){
            puntaje=0;
        }
        return puntaje;
    }
}

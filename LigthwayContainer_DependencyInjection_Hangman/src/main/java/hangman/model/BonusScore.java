package hangman.model;

public class BonusScore implements GameScore{
    private int puntaje=0;
    /**
     * @pre el puntaje inicia en 0
     * @pos el puntaje es mayor o igual a 0
     * @param correctCount puntuacion correcta
     * @param incorrectCount puntacion incorrecta
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        puntaje= puntaje + (correctCount * 10);
        puntaje= puntaje - (incorrectCount * 5);
        if(puntaje<0){
            puntaje = 0;
        }
        return puntaje;
    }
}

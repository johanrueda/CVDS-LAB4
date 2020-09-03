package hangman.model;

public class BonusScore implements GameScore{

    /**
     * @pre el puntaje inicia en 0
     * @pos el puntaje es mayor o igual a 0
     * @param correctCount puntuacion correcta
     * @param incorrectCount puntacion incorrecta
     * @return
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int puntaje=0;
        //System.out.println(correctCount+"inc"+incorrectCount);
        puntaje = puntaje + (correctCount * 10);
        puntaje = puntaje - (incorrectCount * 5);
        if(puntaje<0){
            puntaje = 0;
        }
        return puntaje;
    }
}

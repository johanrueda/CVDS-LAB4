package hangman.model;

public class PowerScore implements GameScore{
    private int puntaje=0;
    /**
     * @pre el puntaje inicia en 0
     * @pos el puntaje es mayor o igual a cero
     * @param correctCount puntuacion correcta
     * @param incorrectCount puntacion incorrecta
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        for(int x=0;x<=correctCount;x++) {
            int potencia = (int) Math.pow(5, x);
            puntaje += potencia;
        }
        if(puntaje<0){
            puntaje=0;
        }
        else if(puntaje>500){
            puntaje=500;
        }
        return puntaje;
    }
}

package hangman.GameScore.test;

import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {

    @Test
    public void OriginalScore() {
        GameScore puntos = new OriginalScore();
        int valor = puntos.calculateScore(0, 0);
        Assert.assertEquals(100,valor);

    }

    @Test
    public void BonusScore() {
        GameScore puntos = new BonusScore();
        int valor = puntos.calculateScore(0, 0);
        Assert.assertEquals(0,valor);
        //System.out.println(valor+"holaaaaaaa");


    }

    @Test
    public void PowerScore() {
        GameScore puntos = new PowerScore();
        int valor = puntos.calculateScore(0, 0);
        Assert.assertEquals(0,valor);
        //System.out.println(valor+"holaaaaaaa");
    }

    /*
     *Condiciones de frontera OriginalScore
     *correctCount es mayor que cero o menor que cero
     *incorrectCount es mayor que cero o menor que cero
     *Teniendo en cuenta las reglas de negocio
     */
    @Test
    public void  OriginalScore1(){
        GameScore puntos = new OriginalScore();
        int valor = puntos.calculateScore(-1,0);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(100, valor);
    }

    public void  OriginalScore2(){
        GameScore puntos = new OriginalScore();
        int valor = puntos.calculateScore(-1,-1);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(100, valor);
    }

    public void  OriginalScore3(){
        GameScore puntos = new OriginalScore();
        int valor = puntos.calculateScore(0,-1);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(100, valor);
    }

    public void  OriginalScore4(){
        GameScore puntos = new OriginalScore();
        int valor = puntos.calculateScore(2,0);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(100, valor);
    }

    public void  OriginalScore5(){
        GameScore puntos = new OriginalScore();
        int valor = puntos.calculateScore(2,1);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(90, valor);
    }


    /*
     *Condiciones de frontera BonusScore
     *correctCount es mayor que cero o menor que cero
     *incorrectCount es mayor que cero o menor que cero
     *Teniendo en cuenta las reglas de negocio
     */
    @Test
    public void  BonusScore1(){
        GameScore puntos = new BonusScore();
        int valor = puntos.calculateScore(-1,0);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(0, valor);
    }

    @Test
    public void  BonusScore2(){
        GameScore puntos = new BonusScore();
        int valor = puntos.calculateScore(-1,-1);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(0, valor);
    }

    @Test
    public void  BonusScore3(){
        GameScore puntos = new BonusScore();
        int valor = puntos.calculateScore(0,1);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(0, valor);
    }

    @Test
    public void  BonusScore4(){
        GameScore puntos = new BonusScore();
        int valor = puntos.calculateScore(2,0);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(20, valor);
    }

    @Test
    public void  BonusScore5(){
        GameScore puntos = new BonusScore();
        int valor = puntos.calculateScore(2,1);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(15, valor);
    }

    /*
     *Condiciones de frontera PowerScore
     *correctCount es mayor que cero o menor que cero
     *incorrectCount es mayor que cero o menor que cero
     *Teniendo en cuenta las reglas de negocio
     */

    @Test
    public void  PowerScore1(){
        GameScore puntos = new PowerScore();
        int valor = puntos.calculateScore(-1,0);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(0, valor);
    }

    @Test
    public void  PowerScore2(){
        GameScore puntos = new PowerScore();
        int valor = puntos.calculateScore(-1,-1);
        //System.out.println(valor+"holaaaaaaa");
       Assert.assertEquals(0, valor);
    }

    @Test
    public void  PowerScore3(){
        GameScore puntos = new PowerScore();
        int valor = puntos.calculateScore(0,1);
       // System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(0, valor);
    }

    @Test
    public void  PowerScore4(){
        GameScore puntos = new PowerScore();
        int valor = puntos.calculateScore(2,0);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(31, valor);
    }

    @Test
    public void  PowerScore5(){
        GameScore puntos = new PowerScore();
        int valor = puntos.calculateScore(2,1);
        //System.out.println(valor+"holaaaaaaa");
        Assert.assertEquals(23, valor);
    }

  }
package edu.badpals.frank_brunos_boxing_examen.round;

public class RoundFactory {
    private final char NUEVE = '9';
    private final char OCHO = '8';
    private final char COMA = ',';
    public Round getRound(String roundScore){
        if (roundScore.indexOf(NUEVE) != -1){
            return new RegularRound(roundScore);
        } else if (roundScore.indexOf(OCHO) != -1) {
            return new KnockdownRound();
        }
        return new PointsDeducted();
    }

}

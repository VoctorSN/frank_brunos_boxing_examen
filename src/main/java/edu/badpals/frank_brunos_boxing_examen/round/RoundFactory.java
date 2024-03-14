package edu.badpals.frank_brunos_boxing_examen.round;

public class RoundFactory {
    private static final char NUEVE = '9';
    private static final char OCHO = '8';
    public static Round getRound(String roundScore){
        if (roundScore.indexOf(NUEVE) != -1){
            return new RegularRound(roundScore);
        } else if (roundScore.indexOf(OCHO) != -1) {
            return new KnockdownRound(roundScore);
        }
        return new PointsDeducted();
    }

}

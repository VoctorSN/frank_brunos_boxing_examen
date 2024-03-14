package edu.badpals.frank_brunos_boxing_examen.Round;

import edu.badpals.frank_brunos_boxing_examen.round.KnockdownRound;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnockdownRoundTest {

    @Test // este para el alumnado
    public void boxerRoundScoreToIntTest() {
        KnockdownRound round = new KnockdownRound("10 - 8");
        round.boxerRoundScore();
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(8, round.getBlueBoxerScore());
    }

    @Test // este para el alumnado
    public void boxerRoundScoreToIntTest2() {
        KnockdownRound round = new KnockdownRound("8 - 10");
        round.boxerRoundScore();
        assertEquals(8, round.getRedBoxerScore());
        assertEquals(10, round.getBlueBoxerScore());
    }
}

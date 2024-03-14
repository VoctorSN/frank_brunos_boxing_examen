package edu.badpals.frank_brunos_boxing_examen;

import edu.badpals.frank_brunos_boxing_examen.round.KnockdownRound;
import edu.badpals.frank_brunos_boxing_examen.round.RegularRound;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularRoundTest {

    @Test // este para el alumnado
    public void boxerRoundScoreToIntTest() {
        KnockdownRound round = new KnockdownRound("10 - 8");
        round.boxerRoundScore();
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(8, round.getBlueBoxerScore());
    }
}

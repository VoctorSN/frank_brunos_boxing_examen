package edu.badpals.frank_brunos_boxing_examen;

import edu.badpals.frank_brunos_boxing_examen.round.RegularRound;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularRoundTest {

    @Test // este para el alumnado
    public void boxerRoundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        round.boxerRoundScore();
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(9, round.getBlueBoxerScore());
    }
}

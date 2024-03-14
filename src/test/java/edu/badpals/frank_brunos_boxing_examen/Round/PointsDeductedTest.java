package edu.badpals.frank_brunos_boxing_examen.Round;

import edu.badpals.frank_brunos_boxing_examen.round.PointsDeducted;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointsDeductedTest {

        @Test // este para el alumnado
        public void boxerRoundScoreToIntTest() {
            PointsDeducted round = new PointsDeducted("10 - 1, 8");
            round.boxerRoundScore();
            assertEquals(10, round.getRedBoxerScore());
            assertEquals(8, round.getBlueBoxerScore());
        }

        @Test // este para el alumnado
        public void boxerRoundScoreToIntTest2() {
            PointsDeducted round = new PointsDeducted("1, 8 - 10");
            round.boxerRoundScore();
            assertEquals(8, round.getRedBoxerScore());
            assertEquals(10, round.getBlueBoxerScore());
        }
    }



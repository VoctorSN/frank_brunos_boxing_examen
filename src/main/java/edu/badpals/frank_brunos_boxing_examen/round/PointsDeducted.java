package edu.badpals.frank_brunos_boxing_examen.round;

public class PointsDeducted implements Round{

        private char OCHO = 8;
        private char COMA = ',';
        private char DIEZ = 10;

        private String roundScore;

        private byte RedBoxerScore = 0;
        private byte BlueBoxerScore = 0;

        public PointsDeducted(String roundScore) {
            this.roundScore = roundScore;
        }

        public void setBlueBoxerScore(byte blueBoxerScore) {
            BlueBoxerScore = blueBoxerScore;
        }

        public void setRedBoxerScore(byte redBoxerScore) {
            RedBoxerScore = redBoxerScore;
        }

        @Override
        public byte getRedBoxerScore() {
            boxerRoundScore();
            return this.RedBoxerScore;
        }

        @Override
        public byte getBlueBoxerScore() {
            boxerRoundScore();
            return this.BlueBoxerScore;
        }

        public String getRoundScore() {
            return roundScore;
        }
        @Override
        public void boxerRoundScore() {
            String roundScore = getRoundScore();
            this.setRedBoxerScore(
                    (byte) (roundScore.charAt(1) == this.COMA ?
                            this.OCHO
                            : this.DIEZ));
            this.setBlueBoxerScore(
                    (byte) (roundScore.charAt(1) == this.COMA ?
                            this.DIEZ
                            : this.OCHO));

        }

        @Override
        public String toString() {
            return getRedBoxerScore() + " - " + getBlueBoxerScore();
        }
    }


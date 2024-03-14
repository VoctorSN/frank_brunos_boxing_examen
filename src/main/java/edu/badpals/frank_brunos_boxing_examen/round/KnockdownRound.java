package edu.badpals.frank_brunos_boxing_examen.round;

public class KnockdownRound implements Round{

    private char OCHO = 8;
    private char OCHO_CHAR = '8';
    private char DIEZ = 10;

    private String roundScore;

    private byte RedBoxerScore = 0;
    private byte BlueBoxerScore = 0;

    public KnockdownRound(String roundScore) {
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
                (byte) (roundScore.charAt(0) == this.OCHO_CHAR ?
                        this.OCHO
                        : this.DIEZ));
        this.setBlueBoxerScore(
                (byte) (roundScore.charAt(0) == this.OCHO_CHAR ?
                        this.DIEZ
                        : this.OCHO));

    }

    @Override
    public String toString() {
        return getRoundScore();
    }
}

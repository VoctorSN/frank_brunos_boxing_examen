package edu.badpals.frank_brunos_boxing_examen.round;

public class RegularRound implements Round{
    private String roundScore;
    private char NUEVE = 9;
    private char NUEVE_CHAR = '9';
    private char DIEZ = 10;
    private byte RedBoxerScore = 0;
    private byte BlueBoxerScore = 0;
    public RegularRound(String roundScore) {
        this.roundScore = roundScore;
        this.boxerRoundScore();
    }

    public void setBlueBoxerScore(byte blueBoxerScore) {
        BlueBoxerScore = blueBoxerScore;
    }

    public void setRedBoxerScore(byte redBoxerScore) {
        RedBoxerScore = redBoxerScore;
    }

    @Override
    public byte getRedBoxerScore() {
        return this.RedBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.BlueBoxerScore;
    }

    @Override
    public void boxerRoundScore() {
        String roundScore = getRoundScore();
        this.setRedBoxerScore(
                (byte) (roundScore.charAt(0) == this.NUEVE_CHAR ?
                                        this.NUEVE
                                        : this.DIEZ));
        this.setBlueBoxerScore(
                (byte) (roundScore.charAt(0) == this.NUEVE_CHAR ?
                                        this.DIEZ
                                        : this.NUEVE));

    }

    public String getRoundScore() {
        return roundScore;
    }
}

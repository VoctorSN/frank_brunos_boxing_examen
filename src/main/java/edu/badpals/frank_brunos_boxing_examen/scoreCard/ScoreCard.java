package edu.badpals.frank_brunos_boxing_examen.scoreCard;

import edu.badpals.frank_brunos_boxing_examen.round.Round;
import edu.badpals.frank_brunos_boxing_examen.round.RoundFactory;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private List<Round> rounds = new ArrayList<>();
    private int RedBoxerFinalScore = 0;
    private int BlueBoxerFinalScore = 0;

    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public void setBCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

    public byte getNumRounds(){
        return (byte) this.getRounds().size();
    }

    public List<Round> getRounds() {
        return rounds;
    }

    @Override
    public String toString(){

                String stringFinal ="\t\t\t\t\t" + this.getColor() + "\n" +
                "\t\t" + this.getRedCorner() + "\t" + this.getBlueCorner() + "\n" +
                "\t\t\t\t\t" + this.getNumRounds() + " rounds" + "\n" +
                "\tRound\tScore\tRound\tScore\tRound\n" +
                "\tScore\tTotal           Total\tScore\n";
                byte numRonda = 0;
                for (Round round : getRounds()){
                    numRonda += 1;
                    stringFinal +=
                            "\t" +
                            round.getRedBoxerScore() +
                            "\t\t\t\t" + numRonda + "\t\t\t\t" +
                            round.getBlueBoxerScore() + "\n";
                }
        return stringFinal;
    }

    public String getColor() {
        return color;
    }

    public String getRedCorner() {
        return redCorner;
    }

    public String getBlueCorner() {
        return blueCorner;
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        int i = 0;
        for (String roundString : judgeScoreCard){
            RoundFactory round = new RoundFactory();
            this.getRounds().add(round.getRound(roundString));
            this.setRedBoxerFinalScore(this.getRounds().get(i).getRedBoxerScore()); ;
            this.setBlueBoxerFinalScore(this.getRounds().get(i).getBlueBoxerScore()); ;
            i+=1;
        }
    }

    public void setRedBoxerFinalScore(int score) {
        this.RedBoxerFinalScore+=score;
    }

    public void setBlueBoxerFinalScore(int score) {
        this.BlueBoxerFinalScore+=score;
    }

    public int getRedBoxerFinalScore() {
        return this.RedBoxerFinalScore;
    }

    public int getBlueBoxerFinalScore() {
        return this.BlueBoxerFinalScore;
    }
}

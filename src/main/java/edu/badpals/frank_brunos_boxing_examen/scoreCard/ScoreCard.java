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
                setRedBoxerFinalScore(0);
                setBlueBoxerFinalScore(0);
                for (Round round : getRounds()){
                    this.addRedBoxerFinalScore(this.getRounds().get(numRonda).getRedBoxerScore());
                    this.addBlueBoxerFinalScore(this.getRounds().get(numRonda).getBlueBoxerScore());
                    numRonda += 1;
                    stringFinal +=
                            "\t" +
                            round.getRedBoxerScore() +
                            "\t\t" + this.getRedBoxerFinalScore() + "\t\t" + numRonda + "\t\t" + this.getBlueBoxerFinalScore() + "\t\t" +
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
        for (String roundString : judgeScoreCard){
            this.getRounds().add(RoundFactory.getRound(roundString));
        }
    }

    public void addRedBoxerFinalScore(int score) {
        this.RedBoxerFinalScore+=score;
    }

    public void addBlueBoxerFinalScore(int score) {
        this.BlueBoxerFinalScore+=score;
    }

    public void setRedBoxerFinalScore(int score) {
        this.RedBoxerFinalScore=score;
    }

    public void setBlueBoxerFinalScore(int score) {
        this.BlueBoxerFinalScore=score;
    }



    public int getRedBoxerFinalScore() {
        return this.RedBoxerFinalScore;
    }

    public int getBlueBoxerFinalScore() {
        return this.BlueBoxerFinalScore;
    }
}

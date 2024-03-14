package edu.badpals.frank_brunos_boxing_examen.scoreCard;

import edu.badpals.frank_brunos_boxing_examen.round.Round;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private List<Round> rounds = new ArrayList<>();

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
        return (
                "\t\t\t\t\t" + this.getColor() + "\n" +
                "\t\t" + this.getBlueCorner() + "\t" + this.getRedCorner() + "\n" +
                "\t\t\t\t\t" + this.getNumRounds() + " rounds" + "\n" +
                "  Round  Score   Round   Score   Round\n" +
                "  Score  Total           Total   Score\n"
        );
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
}

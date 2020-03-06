package model;

import java.time.LocalDateTime;

public class Match {

    private Team team1, team2;
    private String result, type;
    private LocalDateTime time;
    private int id;
    private int[] score;
    private static int nextId;

    public Match(){
        this.id = Match.nextId;
        nextId++;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public String getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int[] getScore() {
        return score;
    }


    public void setTeam1(Team time1) {
        this.team1 = team1;
    }

    public void setTeam2(Team time2) {
        this.team2 = team2;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int[] score) {
        this.score = score;
    }


}
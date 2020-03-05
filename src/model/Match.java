package model;

import java.time.LocalDateTime;

public class Match {

    private Team time1, time2;
    private String result, type;
    private LocalDateTime time;
    private int id;
    private int[] score;
    private static int nextId;

    public Match(){
        this.id = Match.nextId;
        nextId++;
    }

    public Team getTime1() {
        return time1;
    }

    public Team getTime2() {
        return time2;
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


    public void setTime1(Team time1) {
        this.time1 = time1;
    }

    public void setTime2(Team time2) {
        this.time2 = time2;
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
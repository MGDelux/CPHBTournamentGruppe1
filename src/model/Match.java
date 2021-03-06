package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Match {
    private Team team1, team2;
    private String result, type;
    private LocalDateTime time;
    private int id;
    private int[] score = {0,0};
   // private int team1Score;
   // private int team2Score;
    private static int nextId = 0;

    public Match() {
        nextId++;
        this.id = Match.nextId;
    }

    public LocalDateTime SetTime(LocalDateTime matchDate) {
        time = matchDate;
        return time;

    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        if (this.team1 != null && this.team2 != null) {
            String str =" ";
            return "Kamp : \t" +
                    " Tid: KL:" + time.format(formatter)+
                    ", Spil ID :" + id +
                " Hold #1 " + team1.getName() +
                ", VS Hold #2 " + team2.getName() +
                ", Spil resultat:'" + result + '\'' +
                ", type idk'" + type + '\'' +
                ", Score: " + this.score[0] + " - " + this.score[1]+
                ' ';
    }
        else {

        }
        String str = "Error in team display POGGGERS";
        return str;

}
public Team setResult(int team1Score, int team2Score){
        Team winnerteam;
        this.score[0] = team1Score;
        this.score[1] = team1Score;
        if (team1Score > team2Score){
            winnerteam = team1;
            team1.addPoints(3);
        }
        else {
               team2.addPoints(3);
            winnerteam = team2;
        }
        team1.addScore(team1Score-team2Score);
        team2.addScore(team2Score-team1Score);
        return  winnerteam;

}
public  static  void  setScore(){

}
    public void setTeam(Team team1, Team team2){
        this.team1 = team1;
       this.team2 = team2;
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


    public int returnId(){
        return id;
}
    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public void setTeam2(Team team2) {
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

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
}
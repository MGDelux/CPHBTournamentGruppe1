package model;

import java.util.ArrayList;

public class Team {
    private String name;
    private int id, matchCount = 0, score;
    private static int nextId;
    private int [] points = new int[10];
    private String position;
    private ArrayList<Player> players = new ArrayList<Player>();
    String attacker;
    String defender;
    public Team(String teamName, String[] memberNames){
        this.id = nextId;
        this.name = teamName;
        nextId++;
        //attacker = players[0];
        //defender = players[1];


        //System.out.println("Team created with players: "+ attacker + " and "+ defender);
        for (String s:memberNames){
            this.addPlayer(s);
        }

    }
    protected void addPlayer(String name){
        Player p = new Player(name);
        players.add(p);
    }

    public String toString(){
        String str = "Team: " + this.name + ". Players: " + this.players;
        return str;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getScore() {
        return score;
    }

    public static int getNextId() {
        return nextId;
    }

    public int[] getPoints() {
        return points;
    }

    public String getPosition() {
        return position;
    }

    public void addPoints(int i) {
        this.points[matchCount]=i;
        matchCount++;
    }

    public void addScore(int Score) {
        this.score +=score;

    }
}
package model;

import java.util.ArrayList;

public class Team {
    private String name;
    private int id, matchCount, score;
    private static int nextId;
    private int [] points;
    private String position;
    private ArrayList<Player> players = new ArrayList<Player>();
    String attacker;
    String defender;

    public Team(String teamName, String[] memberNames){
        System.out.println("Mathias T COMMIT & PUSH TEST IF YOU SEE THIS IT WAS A SUCCESS v2");
        this.id = nextId;
        name = teamName;
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
}
package model;
import model.Match;
import model.Team;
import java.time.LocalDateTime;
import java.util.ArrayList;
abstract class Tournament {
    private static ArrayList<Team> teams = new ArrayList<Team>();
    private static ArrayList<Match> matches= new ArrayList<Match>();
    private String title;


     Tournament(String title) {
        this.title = title;
    }
       static void updateMatch(int m, Team team1, Team team2) {
        Match match = getMatchById(m);
        match.setTeam(team1,team2);
    }
     protected void displayTeams() {
        System.out.println("\t**** TEAMS ****");

        for (Team team : teams ){  //Team Datatypen gir vi navn og instanser den 'team' printer vi fra 'teams' array.  AKA Team(Datatype) team(var navn) : (for) teams(ArrayList navn)
            System.out.println(team); //print team
        }
    }
    protected Team registerTeam(String teamName,String[] teammembers) { //
        Team newTeam = new Team(teamName, teammembers);
        // System.out.println(newTeam); // Sout nyeste team
        teams.add(newTeam); //Tilføjer team til vores main team arraylist.
        return newTeam;
    }
    protected int scheduleMatch(LocalDateTime date) {
        Match m = new Match();
        m.SetTime(date);
        matches.add(m);
        return m.getId();
    }
    protected static Match getMatchById(int matchId){
        Match foundMatch = null;
        for (Match m1:matches){
            if(m1.getId()==matchId){
                foundMatch =m1;
                break;
            }
        }
        return  foundMatch;
    }
    protected Team registerResult(int id, int team1Score, int team2Score){
        Match match = getMatchById(id);
        Team teamWinner = match.setResult(team1Score,team2Score);
        return teamWinner;
    }
    protected void displayMatches(){
        System.out.println("\t**** SCHEDULE ****");
        for (Match match : matches ) // Samme som display teams
            System.out.println(match); //print match

    }
}



import model.Match;
import model.Player;
import model.Team;

import java.util.ArrayList;

public class Main {
     private static ArrayList<Team> teams = new ArrayList<Team>();
     private static ArrayList<Match> matches= new ArrayList<Match>();

    public static void main(String[] args) {
        String teamName = "Golden memers"; // FAKE UI INPUT
        String[] teamMembers = {"Ali","Mathias"}; // FAKE UI INPUT
      //  Team team1 = new Team("Golden Eagles", new String[]{"Ali", "Mathias"});
        //System.out.println(team1);
        registerTeam(teamName,teamMembers);
        displayTeams();
        scheduleMatch();
        // HEJ ALI
    }


    private static void displayTeams() {
        for (Team team : teams ){  //Team Datatypen gir vi navn og instanser den 'team' printer vi fra 'teams' array.  AKA Team(Datatype) team(var navn) : (for) teams(ArrayList navn)
            System.out.println(team); //print team
        }
    }

    private static void registerTeam(String teamName,String[] teammembers) { //
            Team newTeam = new Team(teamName, teammembers);
           // System.out.println(newTeam); // Sout nyeste team
            teams.add(newTeam); //Tilføjer team til vores main team arraylist.
    }
    private static void scheduleMatch() {
        Match match = new Match();
        match.set
}

}


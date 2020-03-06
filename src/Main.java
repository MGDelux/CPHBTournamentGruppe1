import model.Player;
import model.Team;

import java.util.ArrayList;

public class Main {
     private static ArrayList<Team> teams = new ArrayList<Team>();

    public static void main(String[] args) {
        String teamName = "Golden memers"; // FAKE UI INPUT
        String[] teamMembers = {"Ali","Mathias"}; // FAKE UI INPUT
      //  Team team1 = new Team("Golden Eagles", new String[]{"Ali", "Mathias"});
        //System.out.println(team1);
        registerTeam(teamName,teamMembers);
    }

    private static void registerTeam(String teamName,String[] teammembers) { //
            Team newTeam = new Team(teamName, teammembers);
            System.out.println(newTeam); // Sout nyeste team
            teams.add(newTeam); //Tilføjer team til vores main team arraylist.
    }
}


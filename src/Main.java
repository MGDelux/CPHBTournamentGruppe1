import model.Match;
import model.Team;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
     private static ArrayList<Team> teams = new ArrayList<Team>();
     private static ArrayList<Match> matches= new ArrayList<Match>();
// FIX FOR EMIL PogU

    public static void main(String[] args) {
        String teamName = "Golden memers"; // FAKE UI INPUT
        String[] teamMembers = {"Ali","Mathias"}; // FAKE UI INPUT
        String teamName2 = "EZPZ";
        String[] teamMembers2 ={"Emil","Janus"};
        String teamName3 = "Ali er gud";
        String[] teamMember3={"Tess","Thor"};
        String teamName4 = "IJ ER S!ck";
        String[] teamMembers4= {"Jens","Mqens"};
      //  Team team1 = new Team("Golden Eagles", new String[]{"Ali", "Mathias"});
        //System.out.println(team1);
        Team team1 = registerTeam(teamName,teamMembers);
        Team team2 = registerTeam(teamName2,teamMembers2);
        Team team3 = registerTeam(teamName3,teamMember3);
        Team team4 = registerTeam(teamName4,teamMembers4);
        displayTeams();
        int match1 = scheduleMatch(LocalDateTime.of(2020,06,6,12,0));
        int match2 = scheduleMatch(LocalDateTime.of(2020,06,6,12,0));
        int match3 = scheduleMatch(LocalDateTime.of(2020,06,6,12,0));
        int semif1 = scheduleMatch(LocalDateTime.of(2020,06,6,12,0));
        int semif2 = scheduleMatch(LocalDateTime.of(2020,06,6,12,0));
        updateMatch(match1,team1,team2);
        System.out.println(getMatchById(match1)); // for testing
    }
    private static void updateMatch(int m,Team team1,Team team2) {
        Match match = getMatchById(m);
        match.setTeam(team1,team2);
    }
    private static void displayTeams() {
        for (Team team : teams ){  //Team Datatypen gir vi navn og instanser den 'team' printer vi fra 'teams' array.  AKA Team(Datatype) team(var navn) : (for) teams(ArrayList navn)
            System.out.println(team); //print team
        }
    }
    private static Team registerTeam(String teamName,String[] teammembers) { //
            Team newTeam = new Team(teamName, teammembers);
           // System.out.println(newTeam); // Sout nyeste team
            teams.add(newTeam); //Tilføjer team til vores main team arraylist.
           return newTeam;
    }
    private static int scheduleMatch(LocalDateTime date) {
        Match m = new Match();
         m.SetTime(date);
         matches.add(m);
        return m.getId();
}
    private static Match getMatchById(int matchId){
        Match foundMatch = null;
                for (Match m1:matches){
                    if(m1.getId()==matchId){
                        foundMatch =m1;
                        break;
            }
        }
        return  foundMatch;
    }

}


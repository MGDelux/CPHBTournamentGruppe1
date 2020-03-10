package model;
import model.Match;
import model.Team;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Tournament {
    private static ArrayList<Team> teams = new ArrayList<Team>();
    private static ArrayList<Match> matches= new ArrayList<Match>();
    private String title;
    public void  runTest(){
        System.out.println("\t**** "+title+" ****");
        //  Team team1 = new Team("Golden Eagles", new String[]{"Ali", "Mathias"});
        //System.out.println(team1);
        String teamName = "Golden memers"; // FAKE UI INPUT
        String[] teamMembers = {"Robert","Mathias"}; // FAKE UI INPUT
        String teamName2 = "EZPZ";
        String[] teamMembers2 ={"Emil","Janus"};
        String teamName3 = "Team 3 Gang";
        String[] teamMember3={"Tess","Thor"};
        String teamName4 = "IJ ER S!ck";
        String[] teamMembers4= {"Jens","Mqens"};
        String teamName5 = "CphBusiness";
        String[] teamMembers5= {"Mads","Emil"};
        String teamName6 = "DTU";
        String[] teamMembers6= {"Jane","Karl"};
        String teamName7 = "Corona-virus is fucking lit";
        String[] teamMembers7= {"Ali","Mathias"};
        String teamName8 = "KU";
        String[] teamMembers8= {"Mom","Pops"};
        Team team1 = registerTeam(teamName,teamMembers);
        Team team2 = registerTeam(teamName2,teamMembers2);
        Team team3 = registerTeam(teamName3,teamMember3);
        Team team4 = registerTeam(teamName4,teamMembers4);
        Team team5 = registerTeam(teamName5,teamMembers5);
        Team team6 = registerTeam(teamName6,teamMembers6);
        Team team7 = registerTeam(teamName7,teamMembers7);
        Team team8 = registerTeam(teamName8,teamMembers8);
        System.out.println();
        int match1 = scheduleMatch(LocalDateTime.of(2020,06,6,12,0));
        int match2 = scheduleMatch(LocalDateTime.of(2020,06,6,13,0));
        int Semif1 = scheduleMatch(LocalDateTime.of(2020,06,6,14,0));
        int semif = scheduleMatch(LocalDateTime.of(2020,06,6,15,0));
        updateMatch(match1,team1,team2);
        updateMatch(match2,team3,team4);
        updateMatch(Semif1,team5,team6);
        updateMatch(semif,team7,team8);
        // System.out.println(getMatchById(match1)); // for testing owo
        Team winner = registerResult(match1,4,10);
        Team winner1 = registerResult(match2,8,5);
        Team winner2 =  registerResult(Semif1,5,1);
        Team winner3 = registerResult(Semif1,4,4);

        displayTeams();
        displayMatches();

    }

    public Tournament(String title) {
        this.title = title;
    }
       private static void updateMatch(int m,Team team1,Team team2) {
        Match match = getMatchById(m);
        match.setTeam(team1,team2);
    }
    private static void displayTeams() {
        System.out.println("\t**** TEAMS ****");

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
    private static Team registerResult(int id, int team1Score, int team2Score){
        Match match = getMatchById(id);
        Team teamWinner = match.setResult(team1Score,team2Score);
        return teamWinner;
    }
    private static  void displayMatches(){
        System.out.println("\t**** SCHEDULE ****");
        for (Match match : matches ) // Samme som display teams
            System.out.println(match); //print match

    }
}



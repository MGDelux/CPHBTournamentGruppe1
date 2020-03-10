package model;

import java.time.LocalDateTime;

public class Knockouttournament extends Tournament{

    public Knockouttournament(String title) {
        super(title);
    }

    public void  runTest(){
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
    int maxGroups;
    int maxGroupSize;

    public void Test(){
        System.out.println("Groupmodel Tourny");
    }

    public Knockouttournament(String title, int maxGroups, int maxGroupSize) {
        super(title);
        this.maxGroups = maxGroups;
        this.maxGroupSize = maxGroupSize;
    }
}


import model.Match;
import model.Team;
import model.Tournament;

import java.util.ArrayList;

public class Main {
     private static ArrayList<Team> teams = new ArrayList<Team>();
     private static ArrayList<Match> matches= new ArrayList<Match>();

    public static void main(String[] args) {
        Tournament tournament = new Tournament("CPH CUP");
        tournament.runTest();

    }


}


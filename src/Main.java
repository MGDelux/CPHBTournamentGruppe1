import model.*;

import java.util.ArrayList;

public class Main {
     private static ArrayList<Team> teams = new ArrayList<Team>();
     private static ArrayList<Match> matches= new ArrayList<Match>();

    public static void main(String[] args) {
        Grouptournament Gt = new Grouptournament("OWO");
        Knockouttournament KO = new  Knockouttournament("oWO");
        KO.runTest();
        Gt.runTest();




        }


}


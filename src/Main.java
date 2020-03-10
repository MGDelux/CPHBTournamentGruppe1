import model.*;

import java.util.ArrayList;

public class Main {
     private static ArrayList<Team> teams = new ArrayList<Team>();
     private static ArrayList<Match> matches= new ArrayList<Match>();

    public static void main(String[] args) {
        Tournament tournament = new Tournament("CPH CUP");
        tournament.runTest();
        Knockouttournament KnockOutTournament = new Knockouttournament("KO TOUR");
        KnockOutTournament.showDescrition();
        Grouptournament GroupT = new Grouptournament("Group Tour");
        GroupT.Test();



        }


}


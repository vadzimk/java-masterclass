package Generics;

public class Main {

    public static void main(String[] args){

        LeagueTable<Team<FootballPlayer>> footballLeagueTable = new LeagueTable<>();

        for(int i=0; i<10; i++) {
            footballLeagueTable.addTeam(new Team<FootballPlayer>("team" + i, (int)(Math.random()*1000)+1));
        }



        LeagueTable<Team<BaseballPlayer>> baseballLeagueTable = new LeagueTable<>();
        for(int i=0; i<10; i++) {
            baseballLeagueTable.addTeam(new Team<BaseballPlayer>("team" + i, (int)(Math.random()*1000)+1));
        }

        footballLeagueTable.printTeams();
        System.out.println();
        baseballLeagueTable.printTeams();


    }
}

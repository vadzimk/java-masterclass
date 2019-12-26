package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {

    private ArrayList<T> teams;

    public LeagueTable(){
        this.teams = new ArrayList<>();
    }

    public void printTeams(){
        Collections.sort(teams);
        teams.forEach((e)->System.out.println(e.toString()));
    }

    public void addTeam(T newTeam){
        this.teams.add(newTeam);
    }






}

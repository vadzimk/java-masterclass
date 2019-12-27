package generics;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int ranking;
    public ArrayList<T> players;


    public Team(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
        this.players = new ArrayList<>();
    }

    @Override
    public int compareTo(Team<T> o) {
        if (this.ranking > o.ranking)
            return 1;
        else if (this.ranking < o.ranking)
            return -1;
        else return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                '}';
    }

    public boolean addPlayer(T player){
        if(this.players.contains(player)){
            System.out.println("player not added - already exists");
            return false;
        } else {
            players.add(player);
            return true;
        }
    }
}

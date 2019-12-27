package interfacesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitPoints = hitpoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }



    /**
     * @return list of saved state of the player
     * */
    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add(String.valueOf(this.hitPoints));
        list.add(String.valueOf(this.strength));
        list.add(String.valueOf(this.weapon));
        return list;
    }



    /**
     * Reads from the saved list of the state of the player
     * */
        @Override
    public void read(List<String> list) {
        if (list != null && list.size()>0) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }



}

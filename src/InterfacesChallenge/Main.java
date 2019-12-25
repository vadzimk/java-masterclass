package InterfacesChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Player player = new Player("player", 0, 100);
        System.out.println(player.toString());

        player.setHitPoints(5);
        System.out.println(player);
        player.setWeapon("stormBringer");
        saveObject(player);
        //loadObject(player);
        //System.out.println(player);


        Saveable wareWolf= new Monster("wareWolf",0, 100 );
        saveObject(wareWolf);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Saveable o){
        o.write().forEach(e->System.out.println("Saving list item: " + e));
    }

    public static void loadObject(Saveable o){
        ArrayList<String> arrayList = Main.readValues();
        o.read(arrayList);
    }
}

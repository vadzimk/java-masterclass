package InnerCalsses;

public class Main {

    public static void main(String[] args){
        GearBox mcLaren = new GearBox(6); // create an instance of outer class
//        GearBox.Gear first = mcLaren.new Gear(1, 12.3); // create an instance of inner class
//        GearBox.Gear second = mcLaren.new Gear(2, 15.4);
//        GearBox.Gear third = mcLaren.new Gear(3,17.8);

        mcLaren.addGear(1,5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));




    }
}

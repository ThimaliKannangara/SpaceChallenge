import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList <Item> loadItems(String textFile) throws FileNotFoundException {

        ArrayList <Item> items = new ArrayList<>();

        File file = new File(textFile);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            Item item = new Item();
            String entireLine = fileScanner.nextLine();
            String [] nameAndWeight = entireLine.split("=");
            item.setName(nameAndWeight[0]);
            item.setWeight((Integer.parseInt(nameAndWeight[1]))/1000);            //weight of item in tonnes
            items.add(item);
        }

        return items;

    }


    public ArrayList <Rocket> loadU1(ArrayList <Item> items) {

        ArrayList <Rocket> fullyLoadedU1Rockets = new ArrayList<>();

        while (!items.isEmpty()) {

            Rocket u1 = new U1();

            for (int i=0; i<items.size(); i++) {

                Item item = items.get(i);

                if (u1.canCarry(item)) {
                    u1.carry(item);
                    items.remove(i);
                    i--;
                }
            }

            fullyLoadedU1Rockets.add(u1);
        }

        return fullyLoadedU1Rockets;

    }

    public ArrayList <Rocket> loadU2(ArrayList <Item> items) {

        ArrayList <Rocket> fullyLoadedU2Rockets = new ArrayList<>();

        while (!items.isEmpty()) {

            Rocket u2 = new U2();

            for (int i=0; i<items.size(); i++) {

                Item item = items.get(i);

                if (u2.canCarry(item)) {
                    u2.carry(item);
                    items.remove(i);
                    i--;
                }
            }

            fullyLoadedU2Rockets.add(u2);
        }

        return fullyLoadedU2Rockets;

    }




    public int runSimulation(ArrayList <Rocket> rockets) {

        int totalBudget = 0;

        for (Rocket rocket : rockets) {

            boolean launchStatus = rocket.launch();
            boolean landStatus = rocket.land();

            totalBudget += rocket.getRocketCost();


            while (!launchStatus || !landStatus) {
                launchStatus = rocket.launch();
                landStatus = rocket.land();
                totalBudget += rocket.getRocketCost();

            }

        }

        return totalBudget;

    }

}

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main (String [] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();

        ArrayList <Item> allPhase1Items = simulation.loadItems("phase-1.txt");
        ArrayList <Item> allPhase2Items = simulation.loadItems("phase-2.txt");

        ArrayList <Rocket> fullyLoadedU1RocketsForPhase1 = simulation.loadU1(allPhase1Items);
        ArrayList <Rocket> fullyLoadedU1RocketsForPhase2 = simulation.loadU1(allPhase2Items);

        int totalBudgetForPhase1U1Fleet = simulation.runSimulation(fullyLoadedU1RocketsForPhase1);
        int totalBudgetForPhase2U1Fleet = simulation.runSimulation(fullyLoadedU1RocketsForPhase2);

        System.out.println("U1 Fleet----------------------------------------");
        System.out.println("Budget for Phase 1 = "+totalBudgetForPhase1U1Fleet + " million dollars");
        System.out.println("Budget for Phase 2 = "+totalBudgetForPhase2U1Fleet + " million dollars");
        System.out.println("Total Budget = "+(totalBudgetForPhase1U1Fleet+totalBudgetForPhase2U1Fleet)+" million dollars");

        Simulation simulation1 = new Simulation();

        ArrayList <Item> allPhase1Items1 = simulation1.loadItems("phase-1.txt");
        ArrayList <Item> allPhase2Items1 = simulation1.loadItems("phase-2.txt");

        ArrayList <Rocket> fullyLoadedU2RocketsForPhase1 = simulation1.loadU2(allPhase1Items1);
        ArrayList <Rocket> fullyLoadedU2RocketsForPhase2 = simulation1.loadU2(allPhase2Items1);

        int totalBudgetForPhase1U2Fleet = simulation1.runSimulation(fullyLoadedU2RocketsForPhase1);
        int totalBudgetForPhase2U2Fleet = simulation1.runSimulation(fullyLoadedU2RocketsForPhase2);

        System.out.println("\nU2 Fleet----------------------------------------");
        System.out.println("Budget for Phase 1 = "+totalBudgetForPhase1U2Fleet + " million dollars");
        System.out.println("Budget for Phase 2 = "+totalBudgetForPhase2U2Fleet + " million dollars");
        System.out.println("Total Budget = "+(totalBudgetForPhase1U2Fleet+totalBudgetForPhase2U2Fleet)+" million dollars");

    }



}

import java.util.TreeMap;

public class Simulation {

    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Bins simBins;

    public Simulation(Integer numberOfDies, Integer numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation(){
        Dice dice = new Dice(numberOfDies);
        Bins bins = new Bins(numberOfDies,numberOfDies*6);
        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
        this.simBins = bins;
    }

    public void printResults(){

        // Header
        System.out.println("**************************");
        System.out.println("Simulation of " + numberOfDies + " dice tossed " + numberOfTosses + " times.");
        System.out.println("**************************\n");
        // Print lines
        for (int i = numberOfDies; i <= numberOfDies*6; i++) {
            printBinLine(i);
        }
    }

    private void printBinLine(int i) {
        String outStringIndex = String.format("%3d %s", i, ":");
        String outStringCount = String.format("%9d%s ", simBins.getBin(i), ":");
        Double percNumerator = (double)simBins.getBin(i);
        Double perc = percNumerator/numberOfTosses;
        String outStringPerc = String.format("%2.2f ", perc);
        String stars = getStars(perc);
        String outString = outStringIndex + outStringCount + outStringPerc + stars;
        System.out.println(outString);
    }

    private String getStars(Double percentage) {
        String starLine = "";
        for(Double i = 0.00; i < percentage; i += 0.01) {
            starLine += "*";
        }
        return starLine;
    }

}

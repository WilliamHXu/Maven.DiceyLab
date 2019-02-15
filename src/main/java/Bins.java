import java.util.TreeMap;

public class Bins {

    private TreeMap<Integer, Integer> bins;

    public Bins(int lowBin, int highBin){
        this.bins = new TreeMap<Integer, Integer>();
        for (int i = lowBin; i <= highBin; i++) {
            bins.put(i, 0);
        }
    }

    public Integer getBin(int binNumber){
        return bins.get(binNumber);
    }

    public void incrementBin(int binNumber){
        Integer temp = bins.get(binNumber);
        temp++;
        bins.put(binNumber, temp);
    }




}

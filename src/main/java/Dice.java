public class Dice {

    private int numberOfDice;

    // Constructors

    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Dice(){
        this(1);
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += toss();
        }
        return sum;
    }

    public Integer toss() {
        Integer ret = Integer.valueOf((int)(Math.random() * 6) + 1);
        return ret;
    }
}


import org.junit.Assert;
import org.junit.Test;

public class DiceTest {


    @Test
    public void tossTest() {
        Dice dice = new Dice();

        Integer actual = dice.toss();
        System.out.println(actual);
        Assert.assertTrue(1 <= actual && actual <= 6);
    }

    @Test
    public void tossAndSumTest() {
        Dice dice = new Dice(6);

        Integer actual = dice.tossAndSum();
        System.out.println(actual);
        Assert.assertTrue(1 <= actual && actual <= 36);
    }

}

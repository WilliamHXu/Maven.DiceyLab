import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void BinsTest(){
        Bins bins = new Bins(2,12);
        for (int i = 2; i <= 12; i++) {
            for (int j = 0; j < i-1; j++) {
                bins.incrementBin(i);
            }
        }

        Integer exp1 = 1;
        Integer exp2 = 5;
        Integer exp3 = 11;
        Integer act1 = bins.getBin(2);
        Integer act2 = bins.getBin(6);
        Integer act3 = bins.getBin(12);

        Assert.assertEquals(exp1, act1);
        Assert.assertEquals(exp2, act2);
        Assert.assertEquals(exp3, act3);
    }
}

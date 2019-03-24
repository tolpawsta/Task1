import com.tolpawsta.task1.stones.entity.stone.PreciousStone;
import com.tolpawsta.task1.stones.entity.stone.Stone;
import com.tolpawsta.task1.stones.enums.PreciousStoneType;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

public class StoneTest {
   private Stone stone;
    @Before
    public void setUp() {
        //Opacity must be beetwen 1 and 100
        //Weight and Price must be more than 0
        double weight=20.00;
        double price =20.00;
        int opacity=20;
        stone=new PreciousStone(weight,price,opacity, PreciousStoneType.DIAMOND);
    }

    @After
    public void tearDown(){
        stone=null;
    }


    @Test
    public void setOpacityTest_EQUAL() {
        int actual=20;
        int expacted=stone.getOpacity();
        assertEquals(expacted,actual);

    }
    @Test
    public void setOpacityTest_NOT_EQUAL() {
        int actual=-1;
        int expacted=stone.getOpacity();
        assertNotEquals(expacted,actual);

    }
    @Test
    public void setWeightTest_EQUAL() {
        double actual=20.00;
        double expacted=stone.getWeight();
        assertEquals(expacted,actual,0.0001);
    }
    public void setWeightTest_NOT_EQUAL() {
        double actual=0.00;
        double expacted=stone.getWeight();
        assertNotEquals(expacted,actual,0.0001);
    }
    @Test
    public void setPriceTest_Equal() {
        double actual=20.00;
        double expacted=stone.getPrice();
        assertEquals(expacted,actual,0.0001);
    }
    @Test
    public void setPriceTest_NOT_Equal() {
        double actual=0.00;
        double expacted=stone.getPrice();
        assertNotEquals(expacted,actual,0.0001);
    }
}
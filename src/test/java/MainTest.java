import com.github.alexv2018.model.BitOperations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by vendin on 18.10.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Beans.xml"})
public class MainTest {

    @Autowired
    private BitOperations bitOperations;

    @Test
    public void testAnd1() {
        int var1 = 0x00000000000000000000000000000000;
        int var2 = 0x00000000000000000000000000000000;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(0, bitOperations.doAnd());
    }

    @Test
    public void testAnd2() {
        int var1 = 0x00000000000000000000000000000000;
        int var2 = 0x00000000000000000000000000000001;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(0, bitOperations.doAnd());
    }

    @Test
    public void testAnd3() {
        int var1 = 0x00000000000000000000000000000001;
        int var2 = 0x00000000000000000000000000000000;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(0, bitOperations.doAnd());
    }

    @Test
    public void testAnd4() {
        int var1 = 0x00000000000000000000000000000001;
        int var2 = 0x00000000000000000000000000000001;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(1, bitOperations.doAnd());
    }

    @Test
    public void testOr1() {
        int var1 = 0x00000000000000000000000000000000;
        int var2 = 0x00000000000000000000000000000000;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(0, bitOperations.doOR());
    }

    @Test
    public void testOr2() {
        int var1 = 0x00000000000000000000000000000000;
        int var2 = 0x00000000000000000000000000000001;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(1, bitOperations.doOR());
    }

    @Test
    public void testOr3() {
        int var1 = 0x00000000000000000000000000000001;
        int var2 = 0x00000000000000000000000000000000;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(1, bitOperations.doOR());
    }

    @Test
    public void testOr4() {
        int var1 = 0x00000000000000000000000000000001;
        int var2 = 0x00000000000000000000000000000001;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(1, bitOperations.doOR());
    }

    @Test
    public void testXor1() {
        int var1 = 0x00000000000000000000000000000000;
        int var2 = 0x00000000000000000000000000000000;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(0, bitOperations.doXor());
    }

    @Test
    public void testXor2() {
        int var1 = 0x00000000000000000000000000000000;
        int var2 = 0x00000000000000000000000000000001;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(1, bitOperations.doXor());
    }

    @Test
    public void testXor3() {
        int var1 = 0x00000000000000000000000000000001;
        int var2 = 0x00000000000000000000000000000000;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(1, bitOperations.doXor());
    }

    @Test
    public void testXor4() {
        int var1 = 0x00000000000000000000000000000001;
        int var2 = 0x00000000000000000000000000000001;

        bitOperations = new BitOperations(var1, var2);
        assertEquals(0, bitOperations.doXor());
    }

    @Test
    public void testNot() {
//        int var1 = 0x0;
//        int var2 = 0x1;
//
//        bitOperations = new BitOperations();
//        assertEquals( new Long(0x11111111111111111111111111111111l), Integer.toUnsignedLong(bitOperations.doNot(var1)));
//        assertEquals( 0x11111111, bitOperations.doNot(var1));
    }


}

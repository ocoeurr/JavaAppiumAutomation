import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int number = getLocalNumber();
        Assert.assertTrue("This method doesn't return 14", number == 14);
    }
}

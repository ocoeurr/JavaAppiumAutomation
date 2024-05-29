import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int number = getLocalNumber();
        Assert.assertTrue("This method doesn't return 14", number == 14);
    }

    @Test
    public void testGetClassNumber() {
        int number = getClassNumber();
        Assert.assertTrue("The returned number isn't greater than 45",number > 45);
    }
}

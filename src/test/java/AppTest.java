import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    private App app = new App();

    @Test
    public void myFirstTest() {
        String expected = "hallo";
        Assert.assertEquals(expected, app.greeting());
    }
}

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AppTest {

    private App app = new App();

    @Test
    public void myFirstTest() {
        String expected = "hallo";
        Assert.assertEquals(expected, app.greeting());
    }

    @Test
    public void mapExample() {
        Map<String, String> timeTable = new HashMap<>();

        timeTable.put("Montag", "Tobias");
        timeTable.put("Dienstag", "Tobias");
        timeTable.put("Mittwoch", "Sarah");
        timeTable.put("Donnerstag", "Sarah");
        timeTable.put("Freitag", "Tobias");
        timeTable.put("Freitag", "Sarah");

        System.out.println(timeTable);

        System.out.println(isFree("Montag", timeTable));
        System.out.println(isFree("Sonntag", timeTable));
    }

    public boolean isFree(String day, Map<String, String> roomTimeTable) {
        return !roomTimeTable.containsKey(day);
    }


}

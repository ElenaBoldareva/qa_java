import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AlexTest {

    private Alex alex;

    @Before
    public void setUpAlex() throws Exception {
        Feline feline = new Feline();
        alex = new Alex(feline);
    }

    @Test
    public void testGetFriends() {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();
        Assert.assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void testGetPlaceOfLiving() {
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetLionKittens() {
        Assert.assertEquals(0, alex.getLionKittens());
    }
}
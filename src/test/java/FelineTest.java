import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(foodList, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String family = "Кошачьи";
        Assert.assertEquals(family, feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittensCount = 0;
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

    @Test
    public void testGetKittensWithoutArgs() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }
}


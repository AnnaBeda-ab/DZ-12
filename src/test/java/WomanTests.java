import org.testng.Assert;
import org.testng.annotations.Test;
import person.Woman;

public class WomanTests {

    @Test(groups = {"alltests"}, dataProvider = "") // тут я окремим провайдером переберу різні значення пенсійного віку для жінки
    public void testWomanIsRetiredTrue() {
        Woman woman = new Woman("Alice", "Grey", 65, true);
        Assert.assertTrue(woman.isRetired(), "Incorrect method for women");
    }

    @Test(groups = {"alltests"})
    public void testWomanIsRetiredFalse() { // тут я окремим провайдером переберу різні значення не пенсійного віку
        Woman woman = new Woman("Alice", "Grey", 30, true);
        Assert.assertFalse(woman.isRetired(), "Incorrect method for women");
    }

    @Test(groups = {"alltests"})
    public void testRegisterPartner() {
        Woman woman = new Woman("Alice", "Grey", 65, true);
        woman.registerPartner("Brown");
        Assert.assertEquals(woman.getLastName(), "Brown", "Error register partner");
    }

    @Test(groups = {"alltests"})
    public void testDeregisterPartner() {
        Woman woman = new Woman("Alice", "Grey", 65, true);
        woman.registerPartner("Blue");
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), "Grey", "Error deregister partner");
    }

}

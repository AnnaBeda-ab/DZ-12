import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import person.Man;

public class ManTests {

    @Test(groups = {"alltests"}, dataProvider = "manRetiredModern" , dataProviderClass = TestDataProvider.class)
        public void testManIsRetiredTrue(int age) {
        Man man = new Man("John", "Break", age, true);
        Assert.assertTrue(man.isRetired(), "Incorrect method for man");
    }

    @Test(groups = {"alltests"}, dataProvider = "manRetiredModNegat", dataProviderClass = TestDataProvider.class)
    public void testManIsRetiredFalse(int age) {
        Man man = new Man("Sam", "Bryan", age, false);
        Assert.assertFalse(man.isRetired(), "Incorrect method for man");
    }
}

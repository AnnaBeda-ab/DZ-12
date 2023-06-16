import dataproviders.TestDataProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import person.Man;

public class ManTests {
    private static final Logger LOG = LogManager.getLogger(ManTests.class);

    @Test(groups = {"alltests"}, dataProvider = "manRetiredModern" , dataProviderClass = TestDataProvider.class)

    public void testManIsRetiredTrue(int age) {
        LOG.info(String.format("Test with parameter age [%d] ", age));
        Reporter.log("[Reporter] log");

        Man man = new Man("John", "Break", age, true);
        Assert.assertTrue(man.isRetired(), "Incorrect method for man");
    }

    @Test(groups = {"alltests"}, dataProvider = "manRetiredModNegat", dataProviderClass = TestDataProvider.class)
    public void testManIsRetiredFalse(int age) {
        LOG.info(String.format("Test with parameter age [%d] ", age));
        Reporter.log("[Reporter] log");
        Man man = new Man("Sam", "Bryan", age, false);
        Assert.assertFalse(man.isRetired(), "Incorrect method for man");
    }
}

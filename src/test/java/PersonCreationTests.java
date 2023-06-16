import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import person.Man;
import person.Woman;

public class PersonCreationTests {

    @Test(description = "checks getting first name of created object", groups = {"alltests", "setget"},
            dataProvider="personCreation", dataProviderClass = TestDataProvider.class)
    public void testGettingFirstName(String firstName, String lastName, int age, boolean partner) {
        Man man = new Man(firstName, lastName, age, partner);
        Assert.assertEquals(man.getFirstName(), firstName, "The first name get is incorrect");
    }

    @Test(description = "checks setting first name after creation the object", groups = {"alltests", "setget"},
            dataProvider="personCreation", dataProviderClass = TestDataProvider.class)
    public void testSettingFirstName(String firstName, String lastName, int age, boolean partner) {
        Man man = new Man("firstName", "lastName", 1, partner);
        man.setFirstName(firstName);
        Assert.assertEquals(man.getFirstName(), firstName, "The first name set is incorrect");
    }

    @Test(description = "checks getting last name of created object", groups = {"alltests", "setget"},
            dataProvider="personCreation", dataProviderClass = TestDataProvider.class)
    public void testGettingLastName(String firstName, String lastName, int age, boolean partner) {
        Man man = new Man(firstName, lastName, age, partner);
        Assert.assertEquals(man.getLastName(), lastName, "The last name get is incorrect");
    }

    @Test(description = "checks setting last name after creatoin the object", groups = {"alltests", "setget"},
            dataProvider="personCreation", dataProviderClass = TestDataProvider.class)
    public void testSettingLastName(String firstName, String lastName, int age, boolean partner) {
        Man man = new Man("firstName", "lastName", 1, partner);
        man.setLastName(lastName);
        Assert.assertEquals(man.getLastName(), lastName, "The last name set is incorrect");
    }

    @Test(description = "checks getting age of created object", groups = {"alltests", "setget"},
            dataProvider="personCreation", dataProviderClass = TestDataProvider.class)
    public void testGettingAge(String firstName, String lastName, int age, boolean partner) {
        Man man = new Man(firstName, lastName, age, partner);
        Assert.assertEquals(man.getAge(), age, "The age get is incorrect");
    }

    @Test(description = "checks setting age after creation the object", groups = {"alltests", "setget"},
            dataProvider="personCreation", dataProviderClass = TestDataProvider.class)
    public void testSettingAge(String firstName, String lastName, int age, boolean partner) {
        Man man = new Man("firstName", "lastName", 1, partner);
        man.setAge(age);
        Assert.assertEquals(man.getAge(), age, "The age set is incorrect");
    }
}



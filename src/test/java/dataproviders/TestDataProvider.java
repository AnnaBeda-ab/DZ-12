package dataproviders;

import models.Ages;
import models.Persons;
import org.testng.annotations.DataProvider;

import java.util.List;

//import static utils.CsvReader.getListObjectFromCsv;
import static utils.CsvReader.getListObjectFromCsvModern;

public class TestDataProvider {
    private static final String PATH = "src/test/resources/dataManRet.csv";
    private static final String PATH_MANNEG = "src/test/resources/dataManRetNegat.csv";
    private static final String PATH_WOM = "src/test/resources/dataWomanRet.csv";
    private static final String PATH_WOMNEG = "src/test/resources/dataWomanRetNegat.csv";
    private static final String PATH_PERSON = "src/test/resources/dataPersonCreat.csv";

    //    @DataProvider (name = "manRetired")
//        public static Object [][] manRetired(){
//        List<Ages> ages =  getListObjectFromCsv();
//        Object [][] objects = new Object[ages.size()][1];
//        for (int i=0; i<ages.size();i++){
//            objects[i][0]= ages.get(i).getAge();
//        }
//        return objects ;}
    @DataProvider(name = "manRetiredModern")
    public static Object[][] manRetiredModern() {

        return getListObjectFromCsvModern(PATH, Ages.class).stream().map(age -> new Object[]{age.getAge()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "manRetiredModNegat")
    public static Object[][] manRetiredModNegat() {
        return getListObjectFromCsvModern(PATH_MANNEG, Ages.class).stream()
                .map(age -> new Object[]{age.getAge()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "womanRetiredMod")
    public static Object[][] womanRetiredMod() {
        return getListObjectFromCsvModern(PATH_WOM, Ages.class).stream()
                .map(age -> new Object[]{age.getAge()})
                .toArray(Object[][]::new);
    }
    @DataProvider(name = "womanRetiredModNeg")
    public static Object[][] womanRetiredModNeg(){
        return getListObjectFromCsvModern(PATH_WOMNEG, Ages.class).stream()
                .map(age->new Object[]{age.getAge()})
                .toArray(Object[][]::new);
    }
    @DataProvider(name="personCreation")
    public static Object [][] personCreat(){
        return getListObjectFromCsvModern(PATH_PERSON, Persons.class).stream()
                .map(person->new Object[]{person.getFirstName(),person.getLastName(),person.getAge(),person.isPartner()})
                .toArray(Object[][]::new);
    }
}


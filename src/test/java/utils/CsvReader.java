package utils;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Ages;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {
//    private static final String PATH = "src/test/resources/dataManRet.csv";
//
//
//    public static List<Ages> getListObjectFromCsv() {
//        try {
//            BufferedReader reader = Files.newBufferedReader(Paths.get(PATH)); //метод читає по рядках, оптимізує ресурси
//            CsvToBean<Ages> csvObjectBuilder = new CsvToBeanBuilder<Ages> (reader)
//                    .withType(Ages.class)
//                    .build();
//            return csvObjectBuilder.parse();
//        } catch (IOException ex) {
//            throw new RuntimeException("The file could not be found" + PATH + ex);
//        }
//    }
    public static <T> List<T> getListObjectFromCsvModern(String path, Class <? extends T> type) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(path)); //метод читає по рядках, оптимізує ресурси
            CsvToBean<T> csvObjectBuilder = new CsvToBeanBuilder<T> (reader)
                    .withType(type)
                    .build();
            return csvObjectBuilder.parse();
        } catch (IOException ex) {
            throw new RuntimeException("The file could not be found" + path + ex);
        }
    }
}

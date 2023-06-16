package models;

import com.opencsv.bean.CsvBindByName;

public class Ages {
    @CsvBindByName(column = "age")
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

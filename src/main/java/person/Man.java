package person;

import io.qameta.allure.Step;

public class Man extends Person {
    public Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }
@Step ("Here I check whether man is retired")
    @Override
    public boolean isRetired() {
        return getAge() > 65;
    }


}

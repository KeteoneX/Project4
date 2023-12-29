package DataObject;

import com.github.javafaker.Faker;

public class LogInData {
    static Faker faker1 = new Faker();

    public static String

    correctUsernameData = "standard_user",
    correctPasswordData = "secret_sauce",


    incorrectUsernameData = faker1.bothify("????##"),
    incorrectPasswordData = faker1.bothify("????##??"),

    emptyUsernameData = "",

    emptyPasswordData = "",

    passwordWithSpaceData = "     ",

    usernameWithSpaceData = "      ";






}

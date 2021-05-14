package tests;

import org.junit.jupiter.api.BeforeAll;
import steps.UserSteps;

public class TestBase {

    static UserSteps userSteps;

    @BeforeAll
    public static void init() {
        userSteps = new UserSteps();
    }

}

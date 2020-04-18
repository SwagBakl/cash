package Content;

import io.qameta.allure.Step;

public class AllureTestSteps {

    @Step("STEP: multiply")
    public static int checkMultiply(int x, int y) {
        return x * y;
    }

    @Step("STEP: devide")
    public static double checkDevide(double x, double y) {
        return x / y;
    }

    @Step("STEP: Destroy COVID-19")
    public static String destroyCovid(String str) {
        return str;
    }
}

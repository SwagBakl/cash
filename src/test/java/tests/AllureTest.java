package tests;

import Content.AllureTestSteps;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureTest {

    @Test
    @Link("https://docs.qameta.io/allure/")
    @Description("Method inspect")
    public void testMultiply() {
        Assert.assertEquals(AllureTestSteps.checkMultiply(2, 6), 12, "No");
    }

    @Test
    @Description("Deviding or shit")
    public void testDevide() {
        Assert.assertEquals(AllureTestSteps.checkDevide(12, 4), 3, "Shall");
    }

    @Test
    @Issue("COVID-19")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Try to destroy virus")
    public void testDestroy() {
        Assert.assertEquals(AllureTestSteps.destroyCovid("#STAYHOME"), "STAYHOME", "Yes");
    }
}

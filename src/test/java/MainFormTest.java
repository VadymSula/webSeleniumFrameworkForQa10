import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainFormTest extends BaseTest {
    private MainPage mainPage;

    @BeforeClass
    public void setUpPage() {
        mainPage = new MainPage();
    }

    @Test
    public void partOfFormTest() {
        String textFromField = mainPage
                .sendTextToHiddenTextField("Hello")
                .getTextFromDateHeaderField();
        Assert.assertEquals(textFromField, "Tuesday, 28 January 2014");
    }
}

package pageObject;

import SeleniumBase.Sbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnitPage extends Sbase {
    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")

    @FindBy(xpath = ".//input[@title='Поиск']")
    private WebElement setSearchText;

    public EnitPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "(.//input[@value='Поиск в Google'])[1]")
    private WebElement submitSearch;

    /**
     * Вводим текст в поисковую строку.
     *
     * @param text
     */
    public void setSearchText(String text) {
        setText(setSearchText, text);
    }

    /**
     * Кликаем по кнопке Поиск в гугле.
     */
    public void clickSubmitSearch() {
        submitSearch.click();
    }

}

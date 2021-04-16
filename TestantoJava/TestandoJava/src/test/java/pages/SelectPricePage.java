package pages;
import org.openqa.selenium.By;

public class SelectPricePage extends BasePage {

    By rb_silver     = By.xpath("//tr/th[2]/label[1]");
    By rb_gold       = By.xpath("//tr/th[2]/label[2]");
    By rb_platinum   = By.xpath("//tr/th[2]/label[3]");
    By rb_ultimate   = By.xpath("//tr/th[2]/label[4]");
    By btn_next      = By.id("nextsendquote");

    public void selectPriceOption(String option){

        switch (option){
            case "Silver":
                driver.findElement(rb_silver).click();
                break;
            case "Gold":
                driver.findElement(rb_gold).click();
                break;
            case "Platinum":
                driver.findElement(rb_platinum).click();
                break;
            case "Ultimate":
                driver.findElement(rb_ultimate).click();
                break;
        }
        driver.findElement(btn_next).click();
    }
}

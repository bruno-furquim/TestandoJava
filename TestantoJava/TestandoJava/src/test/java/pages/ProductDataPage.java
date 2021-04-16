package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage extends BasePage {

    By txt_start_date = By.id("startdate");
    By cb_insurance_sum = By.id("insurancesum");
    By cb_merit_rating = By.id("meritrating");
    By cb_damage_insurance = By.id("damageinsurance");
    By rb_euro_protection = By.xpath("//*/div//div[5]/p/label[1]");
    By rb_legal_defense = By.xpath("//*/div//div[5]/p/label[2]");
    By cb_courtesy_car = By.id("courtesycar");
    By btn_next = By.id("nextselectpriceoption");

    public void fillStartDate(String date) {

        driver.findElement(txt_start_date).sendKeys(date);
    }

    public void selectInsuranceSum(String option) {
        driver.findElement(cb_insurance_sum).click();
        Select opt = new Select(driver.findElement(cb_insurance_sum));
        opt.selectByVisibleText(option);
    }

    public void selectMeritRating(String option) {
        driver.findElement(cb_merit_rating).click();
        Select opt = new Select(driver.findElement(cb_merit_rating));
        opt.selectByVisibleText(option);
    }

    public void selectDamageInsurance(String option) {
        driver.findElement(cb_damage_insurance).click();
        Select opt = new Select(driver.findElement(cb_damage_insurance));
        opt.selectByVisibleText(option);
    }

    public void selectOptionalProducts(String option) {
        if (option == "Euro Protection") {
            driver.findElement(rb_euro_protection).click();
        } else
            driver.findElement(rb_legal_defense).click();
    }

    public void selectCourtesyCar(String option) {
        driver.findElement(cb_courtesy_car).click();
        Select opt = new Select(driver.findElement(cb_courtesy_car));
        opt.selectByVisibleText(option);
    }

    public void clickNext() {
        driver.findElement(btn_next).click();
    }

    public void fillProductData(String start_date, String insurance_sum, String merit_ratting,
                                String damage_insurance, String products, String courtesy_car){
        fillStartDate(start_date);
        selectInsuranceSum(insurance_sum);
        selectMeritRating(merit_ratting);
        selectDamageInsurance(damage_insurance);
        selectOptionalProducts(products);
        selectCourtesyCar(courtesy_car);
        clickNext();
    }

}

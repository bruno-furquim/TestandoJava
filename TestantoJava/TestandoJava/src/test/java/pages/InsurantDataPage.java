package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage extends BasePage {

    By txt_first_name           = By.id("firstname");
    By txt_last_name            = By.id("lastname");
    By txt_date_of_birth        = By.id("birthdate");
    By rb_gender_male           = By.xpath("//*/div//div[4]/p/label[1]");
    By rb_gender_female         = By.id("//*/div//div[4]/p/label[2]");
    By txt_street_address       = By.id("streetaddress");
    By cb_country               = By.id("country");
    By txt_zip_code             = By.id("zipcode");
    By txt_city                 = By.id("city");
    By cb_occupation            = By.id("occupation");
    By rb_hobby_speeding        = By.xpath("//div[10]/p/label[1]/span");
    By rb_hobby_bungee_jumping  = By.xpath("//div[10]/p/label[2]/span");
    By rb_hobby_cliff_diving    = By.xpath("//div[10]/p/label[3]/span");
    By rb_hobby_skydiving       = By.xpath("//div[10]/p/label[4]/span");
    By rb_hobby_other           = By.xpath("//div[10]/p/label[5]/span");
    By txt_site                 = By.id("website");
    By txt_picture              = By.id("picture");
    By btn_next                 = By.id("nextenterproductdata");

    public void fillFirstName(String first_name){

        driver.findElement(txt_first_name).sendKeys(first_name);

    }
    public void fillLastName(String last_name){

        driver.findElement(txt_last_name).sendKeys(last_name);

    }
    public void fillDateOfBirth(String date){

        driver.findElement(txt_date_of_birth).sendKeys(date);

    }
    public void selectGender(String gender){
        if(gender == "Male"){
            driver.findElement(rb_gender_male).click();
        }
        else
            driver.findElement(rb_gender_female).click();

    }
    public void fillStreetAddress(String address){

        driver.findElement(txt_street_address).sendKeys(address);
    }
    public void selectCountry(String option){

        driver.findElement(cb_country).click();
        Select opt = new Select(driver.findElement(cb_country));
        opt.selectByVisibleText(option);
    }
    public void fillZipCode(String zipCode){

        driver.findElement(txt_zip_code).sendKeys(zipCode);
    }

    public void fillCity(String city){

        driver.findElement(txt_city).sendKeys(city);
    }

    public void selectOccupation(String option){
        driver.findElement(cb_occupation).click();
        Select opt = new Select(driver.findElement(cb_occupation));
        opt.selectByVisibleText(option);
    }

    public void selectHobby(String hobby){

        switch (hobby){
            case "Speeding":
                driver.findElement(rb_hobby_speeding).click();
                break;
            case "Bungee Jumping":
                driver.findElement(rb_hobby_bungee_jumping).click();
                break;
            case "Cliff Diving":
                driver.findElement(rb_hobby_cliff_diving).click();
                break;
            case "Skydiving":
                driver.findElement(rb_hobby_skydiving).click();
                break;
            case "Other":
                driver.findElement(rb_hobby_other).click();
                break;
        }
    }
    public void fillWebSite(String site){

        driver.findElement(txt_site).sendKeys(site);

    }

    public void fillPicture(String path){

        driver.findElement(txt_picture).sendKeys(path);
    }

    public void clickNext(){

        driver.findElement(btn_next).click();
    }

    public void fillInsurantData(String first_name, String last_name, String date_of_birth,
                                 String gender, String street_address, String country,
                                 String zip_code, String city, String occupation,
                                 String hobby, String site, String picture){
        fillFirstName(first_name);
        fillLastName(last_name);
        fillDateOfBirth(date_of_birth);
        selectGender(gender);
        fillStreetAddress(street_address);
        selectCountry(country);
        fillZipCode(zip_code);
        fillCity(city);
        selectOccupation(occupation);
        selectHobby(hobby);
        fillWebSite(site);
        fillPicture(picture);
        clickNext();
    }
}

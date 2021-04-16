package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class VehicleDataPage extends BasePage {

    By cb_make                 = By.id("make");
    By cb_model                = By.id("model");
    By txt_cylinder            = By.id("cylindercapacity");
    By txt_engine_performance  = By.id("engineperformance");
    By txt_date_manufacture    = By.id("dateofmanufacture");
    By cb_number_of_seats      = By.id("numberofseats");
    By rb_rigth_hand_drive_yes = By.xpath("//*/div//div[7]/p/label[1]");
    By rb_rigth_hand_drive_no  = By.xpath("//*/div//div[7]/p/label[2]");
    By cb_number_seats_cycle   = By.id("numberofseatsmotorcycle");
    By cb_fuel                 = By.id("fuel");
    By txt_payload             = By.id("payload");
    By txt_total_weight        = By.id("totalweight");
    By txt_list_price          = By.id("listprice");
    By txt_license_plate       = By.id("licenseplatenumber");
    By txt_annual_mileage      = By.id("annualmileage");
    By btn_next                = By.id("nextenterinsurantdata");

   public void selectMake(String make){
       driver.findElement(cb_make).click();
       Select opt_make = new Select(driver.findElement(cb_make));
       opt_make.selectByVisibleText(make);
   }

   public void selectModel(String model){
       driver.findElement(cb_model).click();
       Select opt_model = new Select(driver.findElement(cb_model));
       opt_model.selectByVisibleText(model);
   }

   public void fillCylinderCapacity(String number_cylinder){
       driver.findElement(txt_cylinder).sendKeys(number_cylinder);
   }

   public void fillEnginePerformance(String time){
       driver.findElement(txt_engine_performance).sendKeys(time);
   }

   public void fillDateOfManufacture(String date){
       driver.findElement(txt_date_manufacture).sendKeys(date);
   }

   public void selectNumberOfSeats(String number_seats){
       driver.findElement(cb_number_of_seats).click();
       Select opt_number_of_seats = new Select(driver.findElement(cb_number_of_seats));
       opt_number_of_seats.selectByVisibleText(number_seats);
   }

   public void selectRightHandDrive(String opt_drive){
       if(opt_drive == "Yes"){
           driver.findElement(rb_rigth_hand_drive_yes).click();
       }
       else driver.findElement(rb_rigth_hand_drive_no).click();
   }
    public void selectNumberOfSeatsCycle(String number_seats){
        driver.findElement(cb_number_seats_cycle).click();
        Select opt_number_of_seats = new Select(driver.findElement(cb_number_seats_cycle));
        opt_number_of_seats.selectByVisibleText(number_seats);
    }

   public void selectFuel(String fuel){
       driver.findElement(cb_fuel).click();
       Select opt_fuel = new Select(driver.findElement(cb_fuel));
       opt_fuel.selectByVisibleText(fuel);
   }

   public void fillPayload(String payload){
       driver.findElement(txt_payload).sendKeys(payload);
   }

   public void fillTotalWeight(String total_weight){
       driver.findElement(txt_total_weight).sendKeys(total_weight);
   }

   public void fillPrice(String price){
       driver.findElement(txt_list_price).sendKeys(price);
   }

   public void fillLicense(String number_license){
       driver.findElement(txt_license_plate).sendKeys(number_license);
   }

   public void fillAnnualMileage(String annual_mileage){
       driver.findElement(txt_annual_mileage).sendKeys(annual_mileage);
   }

   public void clickNext(){
       driver.findElement(btn_next).click();
   }

    public void fillVehicleData(String make, String model, String cylinder, String time, String date,
                                String number_seats,String hand_drive, String seats_number, String fuel, String payload,
                                String total_weight, String price,String number_license, String annual_mileage){

        selectMake(make);
        selectModel(model);
        fillCylinderCapacity(cylinder);
        fillEnginePerformance(time);
        fillDateOfManufacture(date);
        selectNumberOfSeats(number_seats);
        selectNumberOfSeatsCycle(seats_number);
        selectFuel(fuel);
        fillPayload(payload);
        fillTotalWeight(total_weight);
        fillPrice(price);
        fillLicense(number_license);
        fillAnnualMileage(annual_mileage);
        clickNext();
    }
}

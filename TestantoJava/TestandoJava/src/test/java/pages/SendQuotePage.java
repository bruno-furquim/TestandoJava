package pages;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SendQuotePage extends BasePage {

    By txt_email       = By.id("email");
    By txt_phone       = By.id("phone");
    By txt_user_name   = By.id("username");
    By txt_password    = By.id("password");
    By txt_conf_pass   = By.id("confirmpassword");
    By txt_comments    = By.id("Comments");
    By btn_send        = By.id("sendemail");
    By msg_success     = By.xpath("/html/body/div[4]/h2");

    public void fillEmail(String email){
        driver.findElement(txt_email).sendKeys(email);
    }

    public void fillPhone(String phone){
        driver.findElement(txt_phone).sendKeys(phone);
    }

    public void fillUserName(String username){
        driver.findElement(txt_user_name).sendKeys(username);
    }

    public void fillPassword(String pass){
        driver.findElement(txt_password).sendKeys(pass);
    }

    public void fillConfPassword(String confPass){
        driver.findElement(txt_conf_pass).sendKeys(confPass);
    }

    public void fillComments(String comments){
        driver.findElement(txt_comments).sendKeys(comments);
    }

    public void clickSend(){
        driver.findElement(btn_send).click();
    }

    public void fillSendQuote(String email, String phone, String username, String pass,
                              String conf_pass, String comments){
        fillEmail(email);
        fillPhone(phone);
        fillUserName(username);
        fillPassword(pass);
        fillConfPassword(conf_pass);
        fillComments(comments);
        clickSend();
    }

    public void ConfmsgSuccess(String msg){
        String text_message = driver.findElement(msg_success).getText();
        Assert.assertEquals(msg, text_message);
    }
}

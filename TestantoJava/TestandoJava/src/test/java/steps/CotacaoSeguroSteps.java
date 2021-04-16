package steps;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.pt.*;
import org.openqa.selenium.support.PageFactory;
import pages.*;

public class CotacaoSeguroSteps {

    WebDriver driver;
    BasePage access = PageFactory.initElements(driver, BasePage.class);
    VehicleDataPage vehicle = PageFactory.initElements(driver, VehicleDataPage.class);
    InsurantDataPage insurant = PageFactory.initElements(driver, InsurantDataPage.class);
    ProductDataPage product = PageFactory.initElements(driver, ProductDataPage.class);
    SelectPricePage price = PageFactory.initElements(driver, SelectPricePage.class);
    SendQuotePage quote = PageFactory.initElements(driver, SendQuotePage.class);

    @Dado("^que João acessou o site Tricentis$")
    public void que_Maria_acessou_o_site_Tricentis() throws Throwable {
        access.init();
    }

    @Dado("^preencheu o formulário sobre dados do veículo$")
    public void preencheu_o_formulário_sobre_dados_do_veículo() throws Throwable {
        vehicle.fillVehicleData("Audi", "Scooter", "10","06", "11/11/2019",
                             "1", "No", "3", "Eletric Power", "400",
                             "652", "50000", "22336", "250" );
    }

    @Dado("^preencheu o formulário referente ao seguro do veículo$")
    public void preencheu_o_formulário_referente_ao_seguro_do_veículo() throws Throwable {
        insurant.fillInsurantData("Bruno", "Furquim", "07/27/1988",
                                  "Male", "Rua Sao Sebastiao", "Brazil",
                                  "17065007", "Bauru", "Farmer",
                                  "Speeding", "www.brunofurquim.com", "C:\\Users\\Piva\\Desktop\\prova_Accenture\\src\\test\\resources\\picture\\picture.jpg");

    }

    @Dado("^preencheu o formulário com dados do seguro$")
    public void preencheu_o_formulário_com_dados_do_seguro() throws Throwable {
        product.fillProductData("08/01/2023", "3.000.000,00", "Bonus 4",
                                "Full Coverage", "Legal Defense Insurance", "Yes");
    }

    @Dado("^selecionou uma opção de seguro$")
    public void selecionou_uma_opção_de_seguro() throws Throwable {
        price.selectPriceOption("Ultimate");
    }

    @Quando("^ela finaliza o cadastro preenchendo o formulário de cotação$")
    public void ela_finaliza_o_cadastro_preenchendo_o_formulário_de_cotação() throws Throwable {
        quote.fillSendQuote("bruno_furquim@msn.com", "14997305680",
                           "brunofurquim", "BrunoFurquim12!", "BrunoFurquim12!",
                           "Cadastro feito online.");
    }

    @Então("^será apresentada uma mensagem informando que o e-mail foi enviado com sucesso$")
    public void será_apresentada_uma_mensagem_informando_que_o_e_mail_foi_enviado_com_sucesso() throws Throwable {
        quote.ConfmsgSuccess("Sending e-mail success!");
        access.close();
    }
}

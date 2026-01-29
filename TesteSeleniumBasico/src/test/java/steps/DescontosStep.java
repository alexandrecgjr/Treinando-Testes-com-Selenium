package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;


public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando")
    public void acessar_site_qazando() {
        homePage.acessarSite();
    }

    @Quando("^preencho meu email$")
    public void preencho_meu_email() throws InterruptedException {
        homePage.scrollDown();
        homePage.PreencherEmail();
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        homePage.GanharCupom();
    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() {
        homePage.verificarCupom();
    }

}

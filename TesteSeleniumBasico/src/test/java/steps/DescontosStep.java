package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class DescontosStep {

    @Dado("^que estou no site da qazando")
    public void acessar_site_qazando() {
        System.out.println("passou 1");
    }

    @Quando("^preencho meu email$")
    public void preencho_meu_email() {
        System.out.println("passou 2");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        System.out.println("passou 3");
    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() {
        System.out.println("passou 4");
    }

}

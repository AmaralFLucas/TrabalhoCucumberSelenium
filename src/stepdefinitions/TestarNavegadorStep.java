package stepdefinitions;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class TestarNavegadorStep {

    Componentes testarNavegador = new Componentes();

    @Quando("instanciar chrome-driver")
    public void instanciar_chrome_driver() {
        testarNavegador.inicializa();

    }

    @Então("o navegador Google Chrome deve abrir")
    public void o_navegador_Google_Chrome_deve_abrir() {
        testarNavegador.navegador();

    }

}

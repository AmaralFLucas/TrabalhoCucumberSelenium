package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/Componentes.feature",
        tags = "@Validar_cadastro_do_usuario, @validar_regras_de_negocio, @validar_botoes_clique_me_e_voltar", glue = "")
public class TestRunner {

}

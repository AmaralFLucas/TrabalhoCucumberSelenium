package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponentesStep {


    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializa();

    }

    @Dado("que o usuário preencheu os campos Nome e Sobrenome selecionou o sexo no campo Sexo")
    public void que_o_usuário_preencheu_os_campos_Nome_e_Sobrenome_selecionou_o_sexo_no_campo_Sexo() {
        componentes.preecherNome();
        componentes.preecherSobrenome();
        componentes.selecionarSexo();
    }

    @Dado("a sua comida favorita no campo Qual sua comida favorita? selecionou a escolaridade e qual esporte pratica e clicou no botão cadastrar")
    public void a_sua_comida_favorita_no_campo_Qual_sua_comida_favorita_selecionou_a_escolaridade_e_qual_esporte_pratica_e_clicou_no_botão_cadastrar() {
        componentes.comidaFavorita();
        componentes.escolaridade();
        componentes.esporte();
        componentes.cadastrar();
    }

    @Então("totas as informações preenchidas deverão aparcer no final da página juntamente com a mensagem Cadastrado!")
    public void totas_as_informações_preenchidas_deverão_aparcer_no_final_da_página_juntamente_com_a_mensagem_Cadastrado() {
        componentes.validarCadastro();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário clicou no botão Cadastrar sem preencher os campos obrigatórios")
    public void que_o_usuário_clicou_no_botão_Cadastrar_sem_preencher_os_campos_obrigatórios() {
        componentes.cadastrar();
    }

    @Então("a mensagem {string} deve aparecer o usuário deverá clicar em ok e preecher o campo Nome")
    public void a_mensagem_deve_aparecer_o_usuário_deverá_clicar_em_ok_e_preecher_o_campo_Nome(String string) {
        componentes.validarMensagemNome();
        componentes.preecherNome();
    }

    @Então("após preencher o campo Nome o usuário deverá clicar em cadastrar novamente")
    public void após_preencher_o_campo_Nome_o_usuário_deverá_clicar_em_cadastrar_novamente() {
        componentes.cadastrar();
    }

    @Então("a mensagem {string} aparecerá o usuário devrá clicar novamente em ok e preencher o campo Sobrenome também")
    public void a_mensagem_aparecerá_o_usuário_devrá_clicar_novamente_em_ok_e_preencher_o_campo_Sobrenome_também(String string) {
        componentes.validarMensagemSobrenome();
        componentes.preecherSobrenome();
    }

    @Então("após preencher o campo Sobrenome o usuário deverá clicar em cadastrar novamente")
    public void após_preencher_o_campo_Sobrenome_o_usuário_deverá_clicar_em_cadastrar_novamente() {
        componentes.cadastrar();
    }

    @Então("a mensagem {string} aparecerá o usuário devrá clicar em ok e informar seu sexo no campo Sexo e clicar em cadastrar uma última vez")
    public void a_mensagem_aparecerá_o_usuário_devrá_clicar_em_ok_e_informar_seu_sexo_no_campo_Sexo_e_clicar_em_cadastrar_uma_última_vez(String string) {
        componentes.validarMensagemSexo();
        componentes.selecionarSexo();
        componentes.cadastrar();
        componentes.fecharNavegador();
    }

    @Quando("o usuário selecionar o botão Clique-Me!")
    public void o_usuário_selecionar_o_botão_Clique_Me() {
        componentes.testarBotaoCliqueMe();
    }

    @Então("deve aperecer Obrigado!")
    public void deve_aperecer_Obrigado() {
        componentes.validarBotaoCliqueMe();
        componentes.fecharNavegador();
    }

    @Quando("o usuário selecionar o botão Voltar")
    public void o_usuário_selecionar_o_botão_Voltar() {
        componentes.testarBotaoVoltar();
    }

    @Então("deve aperecer Voltou!")
    public void deve_aperecer_Voltou() {
        componentes.validarBotaoVoltar();
        componentes.fecharNavegador();
    }
}

#language:pt
  Funcionalidade: Acessar vários componentes html

	Contexto:
	  Dado que o usuário acessou o arquivo Campo de Treinamento

	@Validar_cadastro_do_usuario
	Cenário: Validar cadastro do usuário
	  Dado que o usuário preencheu os campos Nome e Sobrenome selecionou o sexo no campo Sexo
	  E a sua comida favorita no campo Qual sua comida favorita? selecionou a escolaridade e qual esporte pratica e clicou no botão cadastrar
	  Então totas as informações preenchidas deverão aparcer no final da página juntamente com a mensagem Cadastrado!

	@validar_regras_de_negocio
	Cenário: Validar regras de negócio
		Dado que o usuário clicou no botão Cadastrar sem preencher os campos obrigatórios
		Então a mensagem "Nome eh obrigatorio" deve aparecer o usuário deverá clicar em ok e preecher o campo Nome
		E após preencher o campo Nome o usuário deverá clicar em cadastrar novamente
		Então a mensagem "Sobrenome eh obrigatorio" aparecerá o usuário devrá clicar novamente em ok e preencher o campo Sobrenome também
		E após preencher o campo Sobrenome o usuário deverá clicar em cadastrar novamente
		Então a mensagem "Sexo eh obrigatorio" aparecerá o usuário devrá clicar em ok e informar seu sexo no campo Sexo e clicar em cadastrar uma última vez

	@validar_botoes_clique_me_e_voltar
	Esquema do Cenário: Validar botões clique-me e voltar
		Quando o usuário selecionar o botão <botao>
		Então deve aperecer <mensagem>
		Exemplos:
		|botao		|mensagem		|
		|Clique-Me!	|Obrigado!		|
		|Voltar		|Voltou!		|
#language: pt
#econdig: utf-8

Funcionalidade: Realizar o cadastro
  Como usuário do site
  Maria deseja realizar o cadastro
  para que ela possa receber um e-mail com o valor do seguro

  @cadastro
  Cenário: Cotar valor do seguro
    Dado que João acessou o site Tricentis
    E preencheu o formulário sobre dados do veículo
    E preencheu o formulário referente ao seguro do veículo
    E preencheu o formulário com dados do seguro
    E selecionou uma opção de seguro
    Quando ela finaliza o cadastro preenchendo o formulário de cotação
    Então será apresentada uma mensagem informando que o e-mail foi enviado com sucesso
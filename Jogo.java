class Jogo {

  private boolean encerrado;
  private int pontuacao;

  private String alvo;
  private String mixed; //alvo embaralhado

  BancoDePalavras banco = new BancoDePalavras(); //vai sair pra estatico
  Embaralhador mexe = new Embaralhador(); //vai sair pra estatico

  public void inicializa() {
    this.encerrado = false;
    this.pontuacao = 0;
    this.alvo = banco.nova();
    this.mixed = mexe.altera(this.alvo);
  }

  public boolean estaEncerrado() {
     return this.encerrado;
  }

  public int getPontuacao() {
     return this.pontuacao;
  }

  




  /* metodos temporarios. somente pra teste, em amb dev */
  public String getAlvo() {
    return this.alvo;
  }

  public String getMixed() {
    return this.mixed;
  }


}
public class Jogo {

  private boolean encerrado;
  private boolean acertado;
  private int pontuacao;
  private int tentativa;

  private String alvo;
  private String mixed; // alvo embaralhado

  BancoDePalavras banco = new BancoDePalavras(); // vai sair pra estatico
  Embaralhador mexe = new Embaralhador(); // vai sair pra estatico

  public void inicializa() {
    this.encerrado = false;
    this.acertado = false;

    this.alvo = banco.nova();
    this.mixed = mexe.altera(this.alvo);

    // this.pontuacao = 0;
    this.pontuacao = alvo.length() * 5;
    this.tentativa = 0;
  }

  public String getMixed() {
    return this.mixed;
  }
  public boolean encerrado() {
    return this.encerrado;
  }

  public boolean acertado() {
    return this.acertado;
  }

  public int getPontuacao() {
    return this.pontuacao;
  }

  public int getTentativa() {
    return this.tentativa;
  }

  public boolean valida(final String chute) {

    this.tentativa++;

    if (alvo.toUpperCase().equals(chute.toUpperCase())) {
      this.encerrado = true;
      this.acertado = true;
      return true;
    } else {
      this.pontuacao = this.pontuacao - 2 * this.tentativa;
      return false;
    }

  }

  /* metodos temporarios. somente pra teste, em amb dev */
  // public String getAlvo() {
  //   return this.alvo;
  // }


}
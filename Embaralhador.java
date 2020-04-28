import java.util.Random;

public class Embaralhador {

  public String altera(final String palavra) {

    final Random random = new Random();

    final int sorte = random.nextInt(1);

    if (sorte == 1)
      return this.inverte(palavra);

    return this.mudaNada(palavra);

  }

  /**
   * inverte as posicoes da PALAVRA origem primeira com a ultima, segunda com a
   * penultima, e assim sucessivamente
   */
  private String inverte(final String palavra) {

    String mixed = "";

    for (int i = palavra.length() - 1; i >= 0; i--) {
      mixed = mixed + palavra.charAt(i);
    }

    return mixed;
  }

  /**
   * não realiza alteração na PALAVRA
   */
  private String mudaNada(final String palavra) {

    final String mixed = palavra;

    return mixed;
  }

}

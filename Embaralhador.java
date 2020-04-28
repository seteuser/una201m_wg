import java.util.ArrayList;
import java.util.Random;

public class Embaralhador {

  /**
   * centraliza as chamadas para as logicas de embaralhamento
   */
  public String altera(String palavra) {

    Random random = new Random();

    int sorte = random.nextInt(5);

    String embaralhado = "";

    if (sorte == 0)
      embaralhado = this.mudaNada(palavra);
    else if (sorte == 1)
      embaralhado = this.inverte(palavra);
    else if (sorte == 2)
      embaralhado = this.alisson(palavra); // inverte metade
    else if (sorte == 3)
      embaralhado = this.marnes(palavra); // substitui aleatorio
    else if (sorte == 4)
      embaralhado = this.gean(palavra); // substitui constante

    return embaralhado;

  }

  /**
   * não realiza alteração na PALAVRA
   */
  private String mudaNada(final String palavra) {

    final String mixed = palavra;

    return mixed;
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
   * inverteMetade o alisson
   */
  private String alisson(String palavra) {
    String embaralhado;
    int qtdLetras = palavra.length();
    String metadeInicial = palavra.substring(0, qtdLetras / 2);
    String metadeFinal = palavra.substring(qtdLetras / 2, palavra.length());
    embaralhado = metadeFinal + metadeInicial;
    return embaralhado;
  }

  /**
   * substitui aleatorio do marnes
   */
  private String marnes(String palavra) {

    String embaralhado = "";
    ArrayList nrSorteados = new ArrayList<>();

    Random random = new Random();
    int nAleatorio;

    while (embaralhado.length() != palavra.length()) {

      nAleatorio = random.nextInt(palavra.length());

      if (!nrSorteados.contains(nAleatorio)) {

        embaralhado = embaralhado + palavra.charAt(nAleatorio);
        nrSorteados.add(nAleatorio);
      }
    }

    return embaralhado;

  }

  /**
   * escondeConsoante do gean
   */
  private String gean(String palavra) {
    String embaralhado = "";

    int totalRemocao = palavra.length() / 2;

    for (int i = 0; i < palavra.length(); i++) {
      char letraAtual = palavra.charAt(i);

      if (totalRemocao > 0) {
        if (this.eConsoante(letraAtual)) {
          letraAtual = '_';
          totalRemocao--;
        }
      }

      embaralhado += letraAtual;
    }

    return embaralhado;
  }

  // auxiliar metodo interno
  private boolean eVogal(char letra) {

    char[] vogais = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
    boolean eVogal = false;
    for (int j = 0; j < vogais.length; j++) {
      if (letra == vogais[j]) {
        eVogal = true;
        break;
      }
    }

    return eVogal;
  }

  // auxiliar metodo interno
  private boolean eConsoante(char letra) {
    return !this.eVogal(letra);
  }

}

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

class BancoDePalavras {

  PalavraDAO dao = new PalavraDAO(); // mudar por estatico

  public String nova(final int size) {

    return "tempsize";

  }

  public String nova() {

    String palavra = "";
    final ArrayList<String> listaPalavras = new ArrayList<String>();
    final Random random = new Random();

    try {
      final RandomAccessFile dicionario = new RandomAccessFile("dicionario.txt", "r");

      while (palavra != null) {
        palavra = dicionario.readLine();
        if (palavra != null)
          listaPalavras.add(palavra);
      }
      dicionario.close();
    } catch (final IOException ex) {
      ex.printStackTrace();
      palavra = "";
    }

    final int sorte = random.nextInt(listaPalavras.size());
    palavra = listaPalavras.get(sorte);

    return palavra;

  }

}
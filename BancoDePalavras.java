import java.io.RandomAccessFile;
import java.io.IOException;

class BancoDePalavras {

  PalavraDAO dao = new PalavraDAO(); // mudar por estatico

  public String nova(int size) {

    return "tempsize";

  }

  public String nova() {

    String palavra;

    try {
      RandomAccessFile dicionario = new RandomAccessFile("dicionario.txt", "r");
      palavra = dicionario.readLine();
      palavra = dicionario.readLine();
      // palavra = "MAMAO";
      dicionario.close();
    } catch (IOException ex) {
      ex.printStackTrace();
      palavra = "";
    }
    return palavra;

  }

}
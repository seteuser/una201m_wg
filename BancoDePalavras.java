import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

class BancoDePalavras {

  PalavraDAO dao = new PalavraDAO(); // mudar por estatico

  public String nova(int size) {

    return "tempsize";

  }

  public String nova() {

    String palavra = "";
    ArrayList<String> listaPalavras = new ArrayList<String>();
    Random random = new Random();

    try {
      RandomAccessFile dicionario = new RandomAccessFile("dicionario.txt", "r");
      
      while(palavra != null) {
         palavra = dicionario.readLine();
         if (palavra != null) 
             listaPalavras.add(palavra);
      }
      dicionario.close();
    } catch (IOException ex) {
      ex.printStackTrace();
      palavra = "";
    }

    int sorte = random.nextInt(listaPalavras.size());
    palavra = listaPalavras.get(sorte);

    return palavra;

  }

}
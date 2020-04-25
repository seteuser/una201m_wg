import java.io.RandomAccessFile;
import java.io.IOException;

class BancoDePalavras {

    public String nova(int size) {

        return "tempsize";
        
    }

    public String nova() {
      String palavra;
      try {
        RandomAccessFile dicionario = new RandomAccessFile("dicio.txt", "r");
        palavra = dicionario.readLine();
        dicionario.close();
      } catch (IOException ex) {
        ex.printStackTrace();
        palavra = "";
      }
      return palavra;
    }

     



}
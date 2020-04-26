import java.util.Scanner;

public class Console {

  public void executa() {

    final Jogo jogo = new Jogo();
    String chute;
    final Scanner teclado = new Scanner(System.in);

    jogo.inicializa();

    System.out.println("[status] jogo started...");

    System.out.println("alvo -> " + jogo.getAlvo());
    System.out.println("mixed -> " + jogo.getMixed());
    System.out.println("pontos -> " + jogo.getPontuacao());

    while (!jogo.encerrado()) {
        
        System.out.print("De um chute: ");
        chute = teclado.nextLine();

        jogo.valida(chute);

    }

    //if(jogo.acertado()) {}
    System.out.println("*** Parabéns! Voce acertou.");
    System.out.println("Tentativas = " + jogo.getTentativa());
    System.out.println("Pontuacao = " + jogo.getPontuacao());
    
    System.out.println("[status] jogo finished!");

  }

}
class Console {

  public void executa() {

    Jogo jogo = new Jogo();
    jogo.inicializa();
    

    System.out.println("[status] jogo started...");

    System.out.println("alvo -> " + jogo.getAlvo());
    System.out.println("mixed -> " + jogo.getMixed());
    System.out.println("pontos -> " + jogo.getPontuacao());








    System.out.println("[status] jogo finished!");

  }

}
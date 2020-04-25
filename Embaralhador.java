class Embaralhador{


  public String altera(String palavra){ 
    
    int sorte = 1;

    if (sorte==1) 
      return this.inverte(palavra);
    
    return this.mudaNada(palavra);

  }

 /**
  * inverte as posicoes da PALAVRA origem
  * primeira com a ultima, segunda com a penultima, 
  * e assim sucessivamente
  */
  private String inverte(String palavra) {

    String mixed = "";

    for (int i = palavra.length() - 1; i >= 0; i--) {
      mixed = mixed + palavra.charAt(i);
    }

    return mixed;
  }
  
 /**
  * não realiza nenhuma alteração na PALAVRA
  */
  private String mudaNada(String palavra) {
    
    String mixed = palavra;

    return mixed;
  }




}
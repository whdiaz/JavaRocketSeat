
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class Exercicio2 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce una oracion!");
    String oracion =  sc.nextLine();

    System.out.println("Oracion: " + oracion);

    String[] palavras = oracion.toLowerCase().split("\\W+");

    HashMap<String, Integer> contadorDePalavras =  new HashMap<>();
    List<String> sequenciaDePalavras = new ArrayList<>();

    for(String palavra : palavras){
      if (contadorDePalavras.containsKey(palavra)){
        contadorDePalavras.put(palavra, contadorDePalavras.get(palavra)+ 1);
        
      }else {
        contadorDePalavras.put(palavra, 1);
        sequenciaDePalavras.add(palavra);
      }
    }

    for(String palavra : sequenciaDePalavras){
      System.out.println(palavra + ":" + contadorDePalavras.get(palavra));
    }


    
  }
  
}

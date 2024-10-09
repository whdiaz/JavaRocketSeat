
import java.util.HashSet;
import java.util.Set;

public class HashSetCollections {
  public static void main(String[] args) {

    Set<Integer> numeros = new HashSet<>();

    numeros.add(10);
    numeros.add(9);
    numeros.add(7);
    numeros.add(8);

    for (Integer numero : numeros){
      System.out.println(numero);
    }

    System.out.println(numeros.contains(10));
     
  }
  
}

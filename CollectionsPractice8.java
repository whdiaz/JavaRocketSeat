
import java.util.Arrays;
import java.util.HashSet;

public class CollectionsPractice8 {

  public static void main(String[] args) {
    
  

  HashSet<Integer> numerosA = new HashSet<>(Arrays.asList(1,2,3,4,5));
  HashSet<Integer> numerosB = new HashSet<>(Arrays.asList(4,5,6,7,8));
  HashSet<Integer> novoNumeros = new HashSet<>(numerosA);

  novoNumeros.removeAll(numerosB);


System.out.println(novoNumeros);
  
}
}

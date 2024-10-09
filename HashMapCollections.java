import java.util.HashMap;
import java.util.Map;


public class HashMapCollections {
  public static void main(String[] args) {
    
    Map<String, Integer> notas = new HashMap<>();

    notas.put("Willian", 10);
    notas.put("Daniel", 9);
    notas.put("Rosy", 8);

    for(Map.Entry<String, Integer> nota : notas.entrySet()){
      var key = nota.getKey();
      var value = nota.getValue();

      System.out.println("a chave é: " + key + " e o valor é: " + value);
    }


  }
  
}

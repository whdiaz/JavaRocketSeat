
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;



public class Collectionspractice3 {

  public static void main(String[] args) {

    List<Integer> numeros2 = new ArrayList<>(Arrays.asList(1,3,4,3,4,5,6,6,3,2,3,1));



    HashSet<Integer> lista = new HashSet<>(numeros2);

    for(Integer numero : lista){
      System.out.println(numero);
    }

    List<Integer> listaSemDuplicados = new ArrayList<>(lista);

    listaSemDuplicados.forEach(numero -> System.out.println(numero));

  

  }
  
}

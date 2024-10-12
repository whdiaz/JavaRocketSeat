
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class  CollectionsPractice10{

public static void main(String[] args) {

  List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
  int[] numeros2 = {1,2,3,4,5,6,7,8,9};

  Integer sumaDeNumeros =  numeros.stream().mapToInt(Integer::intValue).sum();
  Integer sumaDeNumeros2 = numeros.stream().reduce(0, (a,b) -> a + b);
  Integer sumaDeNumeros3 = IntStream.of(numeros2).sum();

  System.out.println(sumaDeNumeros);
  System.out.println(sumaDeNumeros2);
  System.out.println(sumaDeNumeros3);

  List<Integer> filtrados = numeros.stream().filter(numero -> numero %2 == 0).collect(Collectors.toList());

  System.out.println(filtrados);
  
}    
  


}

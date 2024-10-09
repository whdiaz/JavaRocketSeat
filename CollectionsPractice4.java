
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectionsPractice4 {

  public static void main(String[] args) {
    
  List<Estudante> estudantes = Arrays.asList(new Estudante("Willian", 99), new Estudante("Laura", 78), new Estudante("Romeria", 55), new Estudante("Luis Carlos", 66), new Estudante("Esteban Ricarda", 100));

  estudantes.sort(Comparator.comparing(Estudante::getNota));

  estudantes.forEach(System.out::println);

}


}

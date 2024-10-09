
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsPractice5 {

  public static void main(String[] args) {

    List<Estudante> estudantes = Arrays.asList(new Estudante("Willian", 99), new Estudante("Laura", 78), new Estudante("Romeria", 55), new Estudante("Luis Carlos", 66), new Estudante("Esteban Ricarda", 100));

    HashMap<String, Integer> relacionamento = new HashMap<>();

    for(Estudante estudante : estudantes){
      relacionamento.put(estudante.getNome(), estudante.getNota());
    }

    for(Map.Entry<String, Integer> entry: relacionamento.entrySet()){
      System.out.println("Aluno: " + entry.getKey() + " Nota: " + entry.getValue());
    }

    
  }
  
}

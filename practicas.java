
import java.util.ArrayList;
import java.util.List;

public class practicas {
  public static void main(String[] args) {
    
  
  List<String> nomes = new ArrayList<>();

  nomes.add("Willian");
  nomes.add("Raul");
  nomes.add("Carlos");
  nomes.add("Saul");
  nomes.add("Roberto");
  
  for(String nome : nomes) {
    System.out.println(nome);
  }

  Boolean temNome =  nomes.contains("Willian");

  if(!temNome){
    System.out.println("Nao Tem");
  }else {
    System.out.println("Tem sim!");
  }

  String eliminado = nomes.remove(2);

  System.out.println("O nome eliminado foi: " + eliminado);

  

  for (String nome : nomes) {
    System.out.println(nome);
  }

}
  
}

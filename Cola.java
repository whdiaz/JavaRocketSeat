
import java.util.LinkedList;
import java.util.Queue;

public class Cola {

  Queue<String> fila = new LinkedList<>();
    
  

  public void add(String pessoa){
    fila.add(pessoa);
  }

  public String eliminar() {
    if (!fila.isEmpty()) {
        return fila.poll();
    }
    return null; 
}

public String verPrimeiro(){
  
  return fila.peek();
}

public String estaVacio(){
  String verificador = fila.isEmpty() == false ? "Tiene elementos!" : "Esta vacio!";
  return  verificador;
}

public void lista(){
  for(String pessoa: fila){
    System.out.println(pessoa);
  }
}


  



  
}

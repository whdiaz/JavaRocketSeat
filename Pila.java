
import java.util.LinkedList;

public class Pila {

  LinkedList<String> listaEnlazada = new LinkedList<>();

  public void agregar(String signo){
    listaEnlazada.push(signo);
  }

  public void eliminar(){
    listaEnlazada.pop();
  }

  public void verPrimerElemento(){
    System.out.println(listaEnlazada.peek());

  }

  public String verSiEstaVacia(){
  String mensage = (!listaEnlazada.isEmpty()) ? "la lista tiene elementos" : "La lista no tiene elementos";  
  return  mensage;
  }

  public static boolean estaBalanceada(String cadena){
    Pila pila = new Pila();

    for(int i = 0; i < cadena.length(); i++){
      char caracter = cadena.charAt(i);
      if(caracter == '('){
        pila.agregar("(");
      }
      else if(caracter == ')'){
        if (pila.verSiEstaVacia().equals("La lista no tiene elementos")){
          return false;
        }
        pila.eliminar();

      }
    }

    return pila.verSiEstaVacia().equals("La lista no tiene elementos");
  }
  
}

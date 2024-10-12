

public class PilaMain {

  public static void main(String[] args) {
    
    Pila pila = new Pila();

    String cadena1 = "(()())";  // Balanceada
    String cadena2 = "(()";     // No balanceada

    System.out.println("Cadena 1: " + (pila.estaBalanceada(cadena1) ? "Balanceada" : "No balanceada"));
    System.out.println("Cadena 2: " + (pila.estaBalanceada(cadena2) ? "Balanceada" : "No balanceada"));




  }
  
}

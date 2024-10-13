

public class ColaMain {

  public static void main(String[] args) {
    Cola fila = new Cola();

    fila.add("Willian");
    fila.add("Ramon");
    fila.add("Christian");
    fila.add("Fernada");

    System.out.println(fila.estaVacio());
    System.out.println(fila.verPrimeiro());

    fila.eliminar();
  
    fila.lista();
  
}
}

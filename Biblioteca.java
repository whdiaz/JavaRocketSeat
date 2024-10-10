
import java.util.TreeMap;



public class Biblioteca {

 TreeMap<String, Libro> libros;
 
 public Biblioteca(){
  libros = new TreeMap<>();
 }

 public void agregarLibro(String titulo, String autor){
  Libro libro = new Libro(titulo, autor);
  libros.put(titulo, libro);
  System.out.println("Libro: " + titulo + " Autor: " + autor + " adicionado com sucesso!");

 }

 public void eliminarLibro(String titulo){
  if(libros.remove(titulo) != null){
    System.out.println("Libro: " + titulo + " eliminado");
  }else{
    System.out.println("Libro:" + titulo + " nao encontrado!");
  }
 }

 public void buscarLibro(String titulo){
  Libro libro = libros.get(titulo);
  if(libros.containsKey(titulo)){
    System.out.println("Libro: " + titulo + " encontrado!");
  }else{
    System.out.println("Libro: " + titulo + "nao encontrado!");
  }
 }

public void mostrarTodosOsLibros(){
  if(libros.isEmpty()){
    System.out.println("A Biblioteca esta vazia!");
  }else {
    System.out.println("Libros en la Biblioteca:");
    libros.forEach((titulo, libros) -> System.out.println("Titulo: " + titulo + " Autor: " + libros.getAutor()) );
  }
}

public static void main(String[] args) {
  

  Biblioteca libro = new Biblioteca();

  libro.agregarLibro("El arbol", "Willian");
  libro.agregarLibro("Segredo CLT", "Scarlet");
  libro.agregarLibro("Laboral", "Jhonson");

  libro.mostrarTodosOsLibros();
  libro.eliminarLibro("El arbol");
  libro.buscarLibro("Segredo CLT");
  


}

 


  
}

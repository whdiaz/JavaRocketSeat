

public class Contacto {

  String nombre;
  String telefono;

  public Contacto(String nombre, String telefono){
    this.nombre = nombre;
    this.telefono = telefono;
  }

 

  public String getNombre(){
    return nombre;
  }

  public String getTelefono(){
    return telefono;
  }


  public void  inprimirContacto(){
    System.out.println("Nombre: " + nombre + "Telefono: " + telefono);
  }
  
}

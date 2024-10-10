
import java.util.HashMap;

public class GestaoDeContactos {

HashMap<String, Contacto> listaDecontactos = new HashMap<>();

public void agregarContacto(String nombre, String telefono){
  if (listaDecontactos.containsKey(nombre)){
    System.out.println("Contacto: " + nombre + "Ya existe!");
  }else {
    Contacto novoContacto = new Contacto(nombre, telefono);
    listaDecontactos.put(nombre, novoContacto);
    System.out.println("Contacto: " + nombre + " agragado com sucesso!");
  }
}

public void eliminarContacto(String nombre){
  if (listaDecontactos.containsKey(nombre)){
    listaDecontactos.remove(nombre);
    System.out.println("Contacto: " + nombre + " eliminado com sucesso!");
  }else {
    System.out.println("Contacto no encontrado!");
  }
}

public void buscarContacto(String nombre){
  Contacto contacto = listaDecontactos.get(nombre);
  if(contacto != null){
    System.out.println("contacto: " + nombre + " encontrado");
  }else {
    System.out.println("Contacto: " + nombre + " no encontrado!");
  }
}

public void imprimirContactos(){
  if (listaDecontactos.isEmpty()){
    System.out.println("no hay contactos almazenados!");
  }else {
    System.out.println("Lista de contactos");
    for (Contacto contacto : listaDecontactos.values()){
        contacto.inprimirContacto();

    }
  }
}

  
}

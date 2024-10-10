



public class CollectionsPractice6 {

  public static void main(String[] args) {


    GestaoDeContactos contacto = new GestaoDeContactos();

    contacto.agregarContacto("Willian", "199814285478");
    contacto.agregarContacto("Rebeca", "78547854574");
    contacto.agregarContacto("Yennifer", "78547854574");
    contacto.agregarContacto("Elisa", "78547854574");
    contacto.eliminarContacto("Willian");
    contacto.buscarContacto("Rebeca");
    contacto.imprimirContactos();
  }
  
}

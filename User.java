
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {

  String nome;
  Integer idade;


  public User(String nome, Integer idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public static void main(String[] args) {
    List<User> usuarios = new ArrayList<>();


    

    User user = new  User("Willian", 35);
    User user1 = new  User("João", 54);
    User user2 = new  User("Lucas", 18);
    User user3 = new  User("Santos", 25);
    User user4 = new  User("Perrier", 33);
    User user5 = new  User("Pele", 14);
    User user6 = new  User("Sandoval", 12);
    User user7 = new  User("Christian", 23);

    usuarios.addAll(Arrays.asList(user, user1, user2, user3, user4, user5, user6, user7));

    List<User> menorIdade = usuarios.stream().filter(idade -> idade.idade < 18).collect(Collectors.toList());

    for(User menor : menorIdade){
      System.out.println("nome: " + menor.nome + " idade: " + menor.idade);
    }
}

}

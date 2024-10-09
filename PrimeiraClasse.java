
import java.util.ArrayList;
import java.util.List;





public class PrimeiraClasse {

     public static void main(String[] args) {

          List<String> cars = new ArrayList<>();

          cars.add("Camaro");
          cars.add("Bugatti");
          cars.add("Mustang");

          cars.forEach(nome -> System.out.println("o nome do carro é:" + nome));

          System.out.println("----------------------------------------------------%n");

          for (String car: cars) {
               System.out.println("o tal do carro é: " + car);
               
          }

          System.out.println("----------------------------------------------------%n");

          for(int i = 0; i < cars.size(); i++){
               System.out.println("o carro é: " + cars.get(i));

          }

           
     }
   
}

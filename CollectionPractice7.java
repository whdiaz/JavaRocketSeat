
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionPractice7 {

  public static void main(String[] args) {
    
    Stack<Integer> numeros = new Stack<>();

    numeros.push(1);
    numeros.push(2);
    numeros.push(3);
    numeros.push(4);
    numeros.push(5);

   while(!numeros.isEmpty()){
    System.out.println(numeros.pop());
   }

   Queue<Integer> cola = new LinkedList<>();

   cola.add(1);
   cola.add(2);
   cola.add(3);
   cola.add(4);
   cola.add(5);

   System.out.println(cola.remove());
    
  }




  }
  


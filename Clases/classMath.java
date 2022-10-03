//import java.util.Scanner;

public class classMath {
    public static void main(String[] args) {
         double raiz=Math.sqrt(9);//se usa con double pero se puede convertir a int de la sgte manera  int raiz =(int)Math.sqrt(9);
         System.out.println("La raiz cuadrada de 9 es: "+raiz);

         double base=5;
         double exponente=2;
         double resultado= Math.pow(base, exponente);// primero va la base y exponente, igual se usa en tipo double

         System.out.println("El resultado es: "+resultado);


         double num=4.56;
         long result;
         result=Math.round(num);//redondeo si el numero a redondear es double se coloca long en el resultado y si es float se coloca int en el resultado

         System.out.println("El redondeo sale: "+result);

         double aleatorio;
         aleatorio=Math.random();// coloca un numero random entre 0 y 1

         System.out.println(aleatorio);
    }
}

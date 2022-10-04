import java.util.Scanner;
public class operador {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float numero1,numero2,suma,resta,division,multiplicacion,resto;

        System.out.println("Digite 2 numeros: ");
        numero1=sc.nextFloat();
        numero2=sc.nextFloat();

        suma=numero1+numero2;
        resta=numero1-numero2;
        division=numero1/numero2;
        multiplicacion=numero1*numero2;
        resto=numero1%numero2;//el residuo de una division

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La division es: "+division);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("El resto es: "+resto);
        sc.close();
    }
}

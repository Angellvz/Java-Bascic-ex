import java.util.Scanner;

public class cicloDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,count;

        System.out.println("Digite la cantidad de terminos: ");
        count=sc.nextInt();

        do{//primero ejecuta esta condicion, minimo se ejecuta una vez
            System.out.println(i);
            i++;
        }while(i<=count);//la condicion a evaluar

        sc.close();
    }
    
}

import java.util.Scanner;

public class ejemploWhile1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int i=1, contador;

            System.out.println("Digite cuantos numeros quiere en pantalla: ");
            contador=sc.nextInt();

            while(i<=contador){
                System.out.println(i);
                i++;
            }

            sc.close();

            
    }
}

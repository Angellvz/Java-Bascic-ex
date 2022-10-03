import java.util.Scanner;

public class cicloFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count;
        System.out.println("Ingrese hasta que numero quiere que salga:" );
        count=sc.nextInt();

        for(int i=1;i<=count;i++){


            System.out.println(i);
        }

        sc.close();
    }
}

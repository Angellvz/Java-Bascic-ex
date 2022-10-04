public class peradoresIncrementoDecremento {
    public static void main(String[] args) {
        int x=5;

            x++;// es igual a x+=1; operador de incremento
            System.out.println(x);


        int y=9;
            y--;// es igual  a y-=1;  operador de decremento
            System.out.println(y);



        int v=10,z;

            z=++v;// primero se asigna el incremento o decremento y despues la variable= correcto:   z=++v     incorrecto     z=v++
            System.out.println(z);
    }
}

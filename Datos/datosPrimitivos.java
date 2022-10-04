public class datosPrimitivos{
    public static void main(String[] args) {
        byte entero;//8bits espacio
        short entero1;//16bits espacio
        int entero2;//32bits espacio-mas usado
        long entero3;//64bits 

        //var ejemplovar=25;// el var deduce el tipo de variable de acuero al valor asignado.--Inferencia de tipos

       
            entero=25;
            entero1=13;
            entero2=78;
            entero3=93;
                System.out.println("Entero= "+entero +"\n" + "Entero1= "+entero1+"\n"+"Entero2= "+entero2+"\n"+"Entero3= "+entero3);
        
        double real;//64bits espacio
        float real1;//32bits espacio
            real=25.45;
            real1=3.45f;//se coloca f al final para convertirlo a float

                System.out.println("Numero decimal= "+real+"\n"+"Numero decimal1= "+real1);
    
        char caracter = 'a';//un caracter que puede ser letra o numero entre comillas simples
                System.out.println("Caracter: "+caracter);
        boolean decision =true;//solo puede ser false o true
                System.out.println("La decision es: "+decision);
    } 
}
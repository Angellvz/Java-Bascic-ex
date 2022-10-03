import javax.swing.JOptionPane;

public class ejercicio1Condicionales {
    public static void main(String[] args) {
        int num1,num2;
        JOptionPane.showMessageDialog(null, "Programa que calcula em mayor de 2 numeros ");
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

        if(num1>num2){
            JOptionPane.showMessageDialog(null, "El numero mayor es "+num1);
            
         }
        
        else if(num1==num2){// un elif para evaluar otra condicion
            JOptionPane.showMessageDialog(null, "Los numeros "+num1+" y "+num2+" son iguales ");
        }

        else{
            JOptionPane.showMessageDialog(null, "El numero mayor es "+num2);
         }
    }
}

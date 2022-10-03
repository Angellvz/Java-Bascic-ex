import javax.swing.JOptionPane;

public class ejercicio3Condicionales {
    public static void main(String[] args) {
        int n1,n2,n3;

        n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        n3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));

        if((n1>n2) && (n2>n3)){
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor"+"-"+n1+"-"+n2+"-"+n3+"-");
        }
        else if((n1>n3) && (n3>n2)){
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor"+"-"+n1+"-"+n3+"-"+n2+"-");
        }
        else if((n2>n1) && (n1>n3)){
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor"+"-"+n2+"-"+n1+"-"+n3+"-");
        }
        else if((n2>n3) && (n3>n1)){
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor"+"-"+n2+"-"+n3+"-"+n1+"-");
        }
        else if((n3>n1)&&(n1>n2)){
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor"+"-"+n3+"-"+n1+"-"+n2+"-");
        }
        else if((n3>n2)&&(n2>n1)){
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor"+"-"+n3+"-"+n2+"-"+n1+"-");
        }
        

    }
}

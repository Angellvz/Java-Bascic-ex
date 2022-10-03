//import java.util.Scanner;

import javax.swing.JOptionPane;

public class sentenciaIfElse {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int ge , dato=25;
        ge= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero jaaaa"));

        if(ge !=dato){
            JOptionPane.showMessageDialog(null,"El numero no es 25, es: "+ge);

        }
        else{//no es obligatorio
            
            JOptionPane.showMessageDialog(null,"El numero si es: "+dato);
        }
    }

}

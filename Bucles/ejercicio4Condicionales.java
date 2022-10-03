import javax.swing.JOptionPane;

public class ejercicio4Condicionales{
    public static void main(String[] args) {
        final int saldoInicial=1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
        +"1. Ingresar dinero a la cuenta\n"
        +"2. Retirar dinero de la cuenta\n"
        +"3. Salir"));

        switch(opcion){
            case 1: ingreso=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar: ")); //En caso de que la variable opcion sea 1 ejectura esete case
                saldoActual=saldoInicial+ingreso;
                JOptionPane.showMessageDialog(null, "Su saldo acutal es" + saldoActual);
                break;
            case 2: retiro=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad quedesea retirar: "));

                if(retiro>saldoInicial){
                    JOptionPane.showMessageDialog(null, "Usted no cuenta con tal cantidad de dinero para realizar el retiro");
                }
                else{
                    saldoActual=saldoInicial-retiro;
                    JOptionPane.showMessageDialog(null, "Usted esta retirando "+retiro+"soles"+" Entonces su saldo Actual es"+saldoActual);
                }
            
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Usted salio del menu----");
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                break;
        }

    }
    

        
}

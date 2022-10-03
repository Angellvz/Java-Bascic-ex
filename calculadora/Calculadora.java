package calculadora;

public class Calculadora {
    
    double num1=25;
    double num2=24;
    double result;

public double sumar(double input_a , double input_b){//metodos
    result=input_a+input_b;
    System.out.println(result);
    return result;
}

public double restar(double input_a, double input_b){
    result=input_a - input_b;
    System.out.println(result);
    return result;
}

public double dividir(double input_a, double input_b){
    result=input_a/input_b;
    System.out.println(result);
    return result;
}

public double multiplicar(double input_a, double input_b){
    result=input_a*input_b;
    System.out.println(result);
    return result;
}


}

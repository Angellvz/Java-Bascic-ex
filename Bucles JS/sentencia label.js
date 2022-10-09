// label--Sentencia que permite asociar un bucle a un nombre/ se puede usar con break y continue 
array1=["maria,","josefa","roberta"];
array2=["pedro","marcelo",array1,"josefina"];

forAngel://el label creado-- para identificar el bucle, en este caso el primer bucle for
for (let array in array2){//se recorre el primer array
    if(array==2) {//si esta en la posicion 2 se recorre otro array ya que en el array2, en la posicion 2 estra otro array
        for (let array of array1) {//Se recorre los elementos del array 1
        	continue forAngel;
            document.write(array + "<br>")//se muestra en pantalla
            
        }
          
    }else{//si no es ==2 imprime pedro y marcelo
            document.write(array2[array] + "<br>")//imprime lo anterior
        }
}
//mas informacion = https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Statements/label
//https://runebook.dev/es/docs/javascript/statements/label


//example 2
/* 
let i, j;

loop1:
for (i = 0; i < 3; i++) {      // La primera instrucción for está etiquetada como "loop1"
   loop2:
   for (j = 0; j < 3; j++) {   // La segunda instrucción for está etiquetada como "loop2"
      if (i === 1 && j === 1) {
         continue loop1;       // Salta la iteracion del bucle denominado loop1
      }
      document.write('i = ' + i + ', j = ' + j); //Imprime en el doc el bucle
   }
}*/
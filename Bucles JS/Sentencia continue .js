for(let i=0;i<30;i++){
    if(i==15){     //En otras palabras se salta la iteracion que cumpla con la condicion dada
        continue;/*Si la condicion se cumple, Termina la ejecución de las sentencias de la iteración 
        actual del bucle actual o la etiqueta y continua la ejecución del bucle con la próxima iteración.*/
    }
    document.write(i+"<br>")//escribe en el documento la variable i el numero de veces segun indique el bucle
}
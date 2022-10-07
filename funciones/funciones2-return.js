/*function saludar(){ //se crea la funcion

}
saludar()//se llama la funcion*/


function saludar(){ 
    alert("hola");
    return "la funcion se ejecto correctamente"//finaliza la ejecución de la función y especifica un valor para ser devuelto a quien llama a la función.
}// si no hay return ejecuta undefinide
saludo=saludar()
document.write(saludo)

//mas infromacion = https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Statements/return
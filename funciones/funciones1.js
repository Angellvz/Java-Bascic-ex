//Tambien se puede crear la funcion asi:  saludar = function(){}

function saludar(){//nombra la funcion como saludar
    respuesta=prompt("Hola como fue tu dia brother?: ");//la variable respuesta es lo que responda el usuario
        if(respuesta=="bien"){// si respuesta es igual a bien
            alert("que bueno ");//sale la alerta que bueno
        }else{
            alert("que mal");//si es falso responde que mal
        }
        
    }
    saludar()//ejecuta la funcion saludar--todo lo que esta dentro de la funcion saludar
    
    //mas informacion =https://developer.mozilla.org/es/docs/Web/JavaScript/Guide/Functions
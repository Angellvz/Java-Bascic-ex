//Pide la edad y si es mayor de 18 años indica que ya puede conducir.
let edad=prompt("Indica tu edad: ")
if (Number(edad)==edad){//si edad es un numero ejecuta las sgtes bifurcaciones-este if comprueba que lo ingresado sea numero
    if (edad>=18){
        alert(`Tienes ${edad} anios, ya puedes conducir :)`)
    }
    else{
        alert('Eres menor de edad no puedes conducir :(')
    }
}
else{
    alert(`escribe un numero pss manito `)
}
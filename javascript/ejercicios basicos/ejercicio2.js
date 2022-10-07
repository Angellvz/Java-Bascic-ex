//Pide una nota (número). Muestra la calificación según la nota:

//0-3: Muy deficiente
//3-5: Insuficiente
//5-6: Suficiente
//6-7: Bien
//7-9: Notable
//9-10: Sobresaliente

function nota (note){
    if (note<3 && note>=0){
        alert("Muy deficiente");
    }
    else if(note>=3 && note<5){
        alert("Insuficiente");
    }
     else if(note>=5 && note<6){
        alert("Suficiente");
    }
     else if(note>=6 && note<7){
        alert("Bien");
    }
     else if(note>=7 && note<9){
        alert("Notable");
    }
     else if(note>=9 && note<=10){
        alert("Sobresaliente");
    }
}

let pepe=prompt("Cual es su nota del 1 al 10");
nota(pepe)// mi solucion con funciones


//SOLUCION PAGINA WEB

<script>
//BUCLE PARA QUE PERMITA INTRODUCIR MÁS DE UNA NOTA
do {
	//PIDE UNA NOTA POR TECLADO Y LA GUARDA EN LA VARIABLE nota
	var nota = prompt("Introduce tu nota");
	//SI SE INTRODUJO UN NÚMERO
	if (Number(nota) == nota) {
		//SI LA NOTA ES ENTRE 0 Y 10 COMPRUEBA EL RANGO Y DA UN MENSAJE
		if (nota > 0 && nota <= 10) {
			if (nota < 3) {
				alert("Muy deficiente");
			}
			else if (nota < 5) {
				alert("Insuficiete");
			}
			else if (nota < 6) {
				alert("Suficiente");
			}
			else if (nota < 7) {
				alert("Bien");
			}
			else if (nota < 9) {
				alert("Notable"); 5
			}
			else if (nota >= 9) {
				alert("Sobresaliente");
			}
		}
		//SI LA NOTA NO ES ENTRE 0 Y 10
		else {
			alert("Nota erronea");
		}
	}
	//SI LA NOTA INTRODUCIDA NO ES UN NÚMERO
	else {
		//SI SE HA PULSADO ACEPTAR SIN INTRODUCIR NADA
		if (nota != undefined) {	//No es Undefined cuando se pulsa aceptar.
			alert("Introduce un numero valido");
		}
	}
//EL BUCLE VUELVE ARRIBA MIENTRAS NO SE HAYA PULSADO CANCELAR
} while (nota != undefined);	//Undefined es cuando se pulsa Cancelar.
</script>
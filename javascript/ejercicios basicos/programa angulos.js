let ang=parseInt(prompt("Ingrese un angulo: "));
if (ang==0){
	document.write("El angulo  es nulo :") 
}
else if (ang>0 && ang<90) {

	document.write("El angulo es agudo: ")
}
else if(ang==90){
	document.write("El angulo es recto: ")

}
else if(ang>90 && ang<180){
	document.write("El angulo es obtuso: ")

}
else if(ang==180){
	document.write("El angulo es llano: ")

}
else if(ang>180 && ang<360){
	document.write("El angulo es concavo: ")

}
else if(ang==360){
	document.write("El angulo es completo: ")

}
else{
	document.write("escribe un angulo ps sonso de mrd, por si no entiendes es hasta 360 pdta eres bruto")
}


package ejemplo.interfaces;

	class DeDos implements Series {
	    int iniciar;
	    int valor;
	    int anterior;
	    DeDos(){
	        iniciar=0;
	        valor=0;
	    }
	    public int getSiguiente() {
	        anterior=valor;
	        valor-=2;
	        return valor;
	    }
	    public void reiniciar() {
	        valor=iniciar;
	        anterior=valor-2;
	    }
	    public void setComenzar(int x) {
	        iniciar=x;
	        valor=x;
	        anterior=x-2;
	    }
	    //A?adiendo un m?todo que no est? definido en Series
	    int getAnterior(){
	        return anterior;
	    }
	}


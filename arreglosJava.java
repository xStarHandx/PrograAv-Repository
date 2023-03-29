package APUNTES;

public class arreglosJava {

	public static void main(String[] args) {
		
	}
	
	//ESTA FUNCION NOS SERVIRÁ PARA BUSCAR UN ELEMENTO EN UN VECTOR, PERO BUSCARLO DE 2 EN DOS (MUY RECOMENDABLE)
	private static int buscarBinariamente(int[]vector,int n, int buscando) {
		int i=0;
		int j=n-1;
		int k;
		
		do {
			k=(i+j)/2;
			if(buscando>vector[k]) {
				i= k+1;
			}else {
				j=k-1;
			}
		} while(vector[k] != buscando && i<=1);
		return k;
	}
	
	
	private static int eliminarDato(int[]vector,int n, int elem) {
		int i=0;
		while (i<n && elem!=vector[i]);//DATO ENCONTRADO EN POS "i"
		
		if(i<n) {
			for(int k=i;k<n-1;k++) {
				vector[k]=vector[k+1];
			}
			n--;
		}
		return n;
	}
	
	
	private static int isertarElemento(int[]vector,int ocupado,int nuevo) {
		//BUSQUEDA DE LA POSICION DONDE HACER LA INSERCION,
		//DE MANERA DE MANTENER EL ORDEN DE LOS DATOS, DE MAYOR A MENOR
		int i=0;
		while(i<=ocupado-1 && nuevo>vector[i]) {
			i++;
		}
		//SE DEBE HACER UN CORRIMIENTO (PARTIMOS DEL ULTIMO, Y VAMOS CORRIENDOLOS A LA DERECHA)
		for(int k=ocupado;k>=i+1;k--) {
			vector[k]= vector[k-1];
		}
		
		vector[i]=nuevo;//INSERCION DEL ELEMENTO
		ocupado++;//EL VECTOR TIENE UN ELEMENTO MAS
		return ocupado;
	}
	
	
	

}

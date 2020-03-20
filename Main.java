/**
__________________________________________________________________________________
| Main.java																		   |
| Fecha de creacion: 17/02/2020													   |
|                                                                                  |
* @author Diego Alvarez #19498                                                     | 
|__________________________________________________________________________________|
*/
import java.util.*;
import java.io.*; 

public class Main{
	public static void main(String[] args) {
	ArrayList<String> diccionario = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Textos textos = new Textos();
	Nodo nodo = new Nodo();
	BinaryTree arbol = new BinaryTree();
	// Diccionario de las palabras y el texto a traducir
	diccionario = textos.diccionario();
	String[] traducir = textos.texto();
	String[] lista = new String[2];

	// Se añaden las palabras como nodos, el valor es la palabra en ingles
	// el nombre es la palabra en español 
	for(int i = 0; i<diccionario.size(); i++){
		// Elimina los parentesis y separa por comas las palabras para ser ingresadas bien
		for(int j = 0; j<lista.length; j++){
			lista = diccionario.get(i).replace("(","").replace(".","").replace(")","").split(",");	
		}
		arbol.addNodo(lista[0],lista[1]);

	}
	System.out.println(" _______________________________");
	System.out.println("|\tRecorrido inOrden\t|");
	System.out.println("|_______________________________|");
	arbol.inOrden(arbol.raiz);
	System.out.println(" _______________________________");
	System.out.println("|\tLa traduccion es:\t|");
	System.out.println("|_______________________________|");
	for(int p = 0; p<traducir.length; p++){
		for(int l = 0; l<diccionario.size(); l++){
			//System.out.println("a ver: " + arbol.buscarNodo(traducir[p]));
			if (arbol.buscarNodo(traducir[p]) == null){
				System.out.println("*"+traducir[p]+"*");
			}else{
				System.out.println(arbol.buscarNodo(traducir[p]).nombre);
			}
		}
		//System.out.println(traducido.get(p));
	}

	




  }
}

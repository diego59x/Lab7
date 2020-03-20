/**

_______________________________________________________________________________________________________________________
| Nodo.java																		                               |
| Fecha de creacion: 17/02/2020													                                       |
|                                                                                  									   |
* @author Diego Alvarez #19498																						   |
| Tomado de https://serprogramador.es/programar-arboles-binarios-parte-1-introduccionclasesagregar-nodo /, por MXRCK   | 
|______________________________________________________________________________________________________________________|
*/

public class Nodo {

    /* Declaraciones de variables */
    String valor;
    String nombre;
    Nodo hijoIzquierdo;
    Nodo hijoDerecho;

    /* Constructor */
    public Nodo(){

    }
    public Nodo(String v, String nom) {
        this.valor = v;
        this.nombre =  nom;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    public String toString(){
        return nombre;
    }
/*
    public String getValor(){
        return this.valor;
    }

    public String getNombre(){
        return this.nombre;
    }
*/
}
/**
_______________________________________________________________________________________________________________________
| BinaryTree.java																		                               |
| Fecha de creacion: 17/02/2020													                                       |
|                                                                                  									   |
* @author Diego Alvarez #19498																						   |
| Tomado de https://serprogramador.es/programar-arboles-binarios-parte-1-introduccionclasesagregar-nodo /, por MXRCK   | 
|______________________________________________________________________________________________________________________|
*/

// Arbol.java
public class BinaryTree {
    ComparableAssociation comp = new ComparableAssociation<String, String>();
    /* Atributos */
    Nodo raiz;

    /* Contructories */    
    public BinaryTree() {
        this.raiz = null;
    }

    /* Setters y Getters */
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void addNodo(String d, String nom) {
        Nodo nuevo = new Nodo(d,nom);
        if ( raiz == null ) {
            this.raiz = nuevo;
        }else{
            Nodo auxiliar = raiz;
            Nodo padre;
            while(true){
                padre = auxiliar;
                // Si la raiz es mayor al nuevo, esto indica que debera agregarse
                // Al lado izquierdo de la raiz, de lo contrario
                // El nuevo es mayor a la raiz por lo que se agrega al lado derecho
                if(comp.compareTo(auxiliar.valor, d) > 0){
                    auxiliar = auxiliar.hijoIzquierdo;
                    // se inserta el nodo
                    if(auxiliar==null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hijoDerecho;
                    if(auxiliar == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
	}	
    // Metodo para saber cuando el arbol esta vacio

    public boolean isEmpty(){
        return raiz == null;
    }
    // Metodo para recorrer el arbol InOrden
    public void inOrden(Nodo r){
        if(r != null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.valor);
            inOrden(r.hijoDerecho);
        }
    }
    // Buscar un nodo en el arbol

    public Nodo buscarNodo(String d){
        Nodo aux = raiz;
        // Se hace una copia de la raiz para trabajar mas bonito
        // Mientras el valor de la raiz sea diferente a lo ingresado va a buscar
        while(aux.valor != d){
            if(comp.compareTo(aux.valor, d) > 0){
                aux = aux.hijoIzquierdo;
                // Como ya encontro el valor se cierra el ciclo de esta manera
                aux.valor = d;
            }else{
                aux = aux.hijoDerecho;
                // Como ya encontro el valor se cierra el ciclo de esta manera
                aux.valor = d;
            }
            if(aux == null){
                return null;
            }
        }

    return aux;
    }
}
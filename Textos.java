/**
__________________________________________________________________________________
| Textos.java																		   |
| Fecha de creacion: 17/02/2020													   |
|                                                                                  |
* @author Diego Alvarez #19498                                                     | 
|__________________________________________________________________________________|
*/
import java.util.*;
import java.io.*; 

public class Textos{
  BinaryTree arbol = new BinaryTree();

	public ArrayList<String> diccionario(){
    ArrayList<String> info = new ArrayList<String>();
       // Se agregan las palabras del diccionario
       //Se lee el archivo
        File f = new File("Diccionario.txt");
    	BufferedReader entrada;
   		try 
   		{
            entrada = new BufferedReader(new FileReader(f));
            while(entrada.ready())
            {
                info.add(entrada.readLine());
            }
    	}catch (IOException e)
    	{
            e.printStackTrace();
		}
		return info;
	}


	public String[] texto(){
		  String  info = ""; 
      //Se lee el archivo
      File f = new File("Texto.txt");
    	BufferedReader entrada;
   		try 
   		{
            entrada = new BufferedReader(new FileReader(f));
            while(entrada.ready())
            {
                info += entrada.readLine();
            }
    	}catch (IOException e)
    	{
            e.printStackTrace();
		  }
    String [] texto = info.replace(".","").split(" ");
		return texto;
	}



}
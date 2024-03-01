package listas_00;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Listas_00 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String palabra = null,palabraBusc = null;
		int inicio = 0, fin = 0;
/************************ Definición de la lista ***********************/		
		List<String> lista = new ArrayList<String>();
/************************** Llenado de la lista ************************/
		System.out.print("Teclee palabra (Fin para finalizar): ");
		palabra = e.nextLine();
		while(!palabra.equalsIgnoreCase("Fin")) {
			lista.add(palabra);
			System.out.print("Teclee palabra (Fin para finalizar): ");
			palabra = e.nextLine();
		}
		System.out.println("\nLista creada => "+lista);
		System.out.println("\nTamaño de la lista---------> "+lista.size()+"\n\n"); //Tama�o de la lista
/************************ Visualizado de la lista **********************/	
// Con indice.............
		System.out.println("\nLectura a través de un índice:\n");
		for (int i = 0; i < lista.size(); i++ )
			System.out.println(lista.get(i));
		System.out.println("\n\n");
// Con iterador...........
		System.out.println("\nLectura a través de un Iterador:\n");
		Iterator<String> it = lista.iterator();
		while(it.hasNext())
			System.out.println(it.next());
/********************* Modificación de una lista *********************/
		System.out.print("\nNueva palabra: ");
		palabra = e.nextLine();
		System.out.print("Posición: ");
		inicio = e.nextInt();
		lista.set(inicio,palabra);
		e.nextLine();
		visualizarLista(lista);
		visualizarListaIterator(lista);
/***************** Borrado de un elemento de la lista ****************/
		System.out.print("Posición del elemento a borrar? ");
		inicio = e.nextInt();
		e.nextLine();
		lista.remove(inicio);
		System.out.print("Palabra a borrar? ");
		palabra = e.nextLine();
		lista.remove(palabra);
		System.out.println("\nVisualizar la lista para ver lo que borra.\n");
		visualizarLista(lista);
/******************* Visualización de una sublista *******************/
		System.out.print("Inicio de la lista? ");
		inicio = e.nextInt();
		System.out.print("Final de la lista? ");
		fin = e.nextInt();
		if(fin > lista.size())
			fin = lista.size();
		e.nextLine();
		System.out.println("\n"+ lista.subList(inicio, fin));
/******************* Buscar un elemento en la lista ******************/	
		System.out.print("\nPalabra a buscar? ");
		palabraBusc = e.nextLine();
		if(lista.contains(palabraBusc))
			System.out.println("\nLa palabra SI está en la lista\n");
		else
			System.out.println("\nLa palabra NO está en la lista\n");		
/****************** Comprobar si la lista está llena *****************/		
		if(lista.isEmpty())
			System.out.println("La lista SI está vacía (Primera)");
		else
			System.out.println("La lista NO está vacía (Primera)");
		System.out.println("Tamaño antes de vaciar la lista => "+lista.size());
		lista.clear();     // Borramos todos los elementos de la lista.if(lista.isEmpty())
		System.out.println("Tamaño después de vaciar la lista => "+lista.size());
		if(lista.isEmpty())
			System.out.println("La lista SI está vacía (Segunda)");
		else
			System.out.println("La lista NO está vacía (Segunda)");
		e.close();
	}
	static void visualizarLista(List<String> lista) {
		System.out.println("\n\tCon índice.\n");
		for (int i = 0; i < lista.size(); i++ )
			System.out.println(lista.get(i));
		System.out.println("\n\n");
	}
	static void visualizarListaIterator(List<String> l) {
		System.out.println("\n\tCon Iterator.\n");
		Iterator<String> it = l.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}

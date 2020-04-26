/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 24-04-2020
 * @version 24-04-2020
 *
 * Arranque del programa
 */
 
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args){
		Factory factory = new Factory();
		Scanner sc = new Scanner(System.in);
		//Implementacion del arbol escogido con Factory 
		System.out.println("Ingrese el numero de implementacion que desea utilizar: \n1. Splay tree \n2. RBT");
		String opcion = sc.nextLine();
		Tree<Word<String>> arbol = factory.factory(opcion);
		//Lectura archivo diccionario 
		String archive = "Spanish.txt";
		File fichero = new File(archive);
		Scanner s = null;
		String linea = "";
		Tree<Word<String>> diccionario = factory.factory(opcion); //Arbol para guardar el diccionario 
		//Prueba para leer el archivo 
		/*
		String p = "abdomen	abdo/men";
		String pa = "";
		String[] pp = p.split("	"); // no es un espacio es un tab 
		String w = pp[0]; //palabra en ingles 
		for(int i = 0; i<pp[1].length(); i++){
			Character l = pp[1].substring(i,i+1).charAt(0);
			if(Character.isLetter(l)==true || l.equals(' ')==true || l.equals('~')==true ||l.equals('/')==true){
				pa = pa + Character.toString(l);
			}
			else i = pp[1].length(); 
		}
		System.out.println(w+ "//" +pa);
		*/
		
		//we create a try that tries to read txt that catches if the txt does not exist
		try {
			//the scanner reads the file
			s = new Scanner(fichero);
			int c = 0;
			while(s.hasNextLine()){
				//Las primeras 10 lineas no son utiles 
				c++;
				if (c>=10){
					linea = s.nextLine();
					String[] lineaA = linea.split("	"); // no es un espacio es un tab 
					String word = lineaA[0]; //palabra en ingles 
					String palabra = "";
					for(int i = 0; i<lineaA[1].length(); i++){
					Character l = lineaA[1].substring(i,i+1).charAt(0);
						if(Character.isLetter(l)==true || l.equals(' ')==true || l.equals('~')==true ||l.equals('/')==true){
							palabra = palabra + Character.toString(l);
						}
						else i = lineaA[1].length(); 
					}
					System.out.println(word +"//"+palabra);
				}
			}
		}
		//if the txt does not exist it prints the exception message
		catch (Exception ex) { 
			System.out.println("Mensaje: " + ex.getMessage());
		}
		//FInally we close the txt
		finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
    }

}

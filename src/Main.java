/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 24-04-2020
 * @version 24-04-2020
 * @git https://github.com/Bato007/HT9.git
 *
 * Arranque del programa
 */

import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String auxS;
        //Implementacion del arbol escogido con Factory
        System.out.println("Ingrese el numero de implementacion que desea utilizar: \n1. Hash \n2. RBT");
        String opcion = sc.nextLine();
        Tree<String, String> arbol = Factory.factory(opcion);
        
        Tree<String, String> diccionario = Factory.factory(opcion); //Arbol para guardar el diccionario
		Word<String, String> aux;

        //we create a try that tries to read txt that catches if the txt does not exist
		String read;
        try {
			
            FileReader file = new FileReader("Spanish.txt");
            BufferedReader buffer = new BufferedReader(file);
			for(int i = 0; i < 10; i++){
                buffer.readLine();
            }
            while((read = buffer.readLine()) != null){
                //Las primeras 10 lineas no son utiles
                String[] lineaA = read.split("\t");
                String word = lineaA[0]; //palabra en ingles
                String palabra = "";
                for(int i = 0; i<lineaA[1].length(); i++){
                    Character l = lineaA[1].substring(i,i+1).charAt(0);
                    if(Character.isLetter(l)==true || l.equals(' ')==true || l.equals('~')==true ||l.equals('/')==true){
                        palabra = palabra + Character.toString(l);
                    }
                    else i = lineaA[1].length();
                }
				aux = new Word<>(word, palabra);
				if(!diccionario.contains(aux.getWord())){
                    diccionario.add(aux);
                }
            }
        }
        catch (Exception e){
            System.out.print("No se encuentra el diccionario");
        }
		String[] line;
		try{
            FileReader file = new FileReader("texto.txt");
            BufferedReader buffer = new BufferedReader(file);

            read = buffer.readLine();
            line = read.split(" ");

            // Buscando definicion
            for(int i = 0; i < line.length; i++){

                if((auxS = diccionario.get(line[i])) != null)
                    System.out.println(line[i] + " se encontraron las siguientes definiciones: " + auxS);
                else
                    System.out.println("No se encuentra " + line[i] + " en el diccionario");
            }

        } catch (Exception e){
            System.out.print("No se encuentra el archivo");
        }
    }

}

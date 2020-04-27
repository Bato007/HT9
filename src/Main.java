/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 24-04-2020
 * @version 24-04-2020
 * @git https://github.com/Bato007/HT9.git
 *
 * Arranque del programa
 */
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args){
		Tree<Word<String>> diccionario;
		Word<String> aux;
        Scanner sc = new Scanner(System.in);

        String[] line;
        String opcion, read ;

		//Implementacion del arbol escogido con Factory 
		System.out.println("Ingrese el numero de implementacion que desea utilizar: \n1. Splay tree \n2. RBT");
		opcion = sc.nextLine();
        diccionario = Factory.factory(opcion);

        try{
            FileReader file = new FileReader("Spanish.txt");
            BufferedReader buffer = new BufferedReader(file);

            for(int i = 0; i < 10; i++){
                buffer.readLine();
            }

            while ((read = buffer.readLine()) != null){

                line = read.split("\t");
                aux = new Word<>(line[0], line[1]);

                if(!diccionario.contains(aux)){
                    diccionario.add(aux);
                }

            }

        } catch (Exception e){
            System.out.print("No se encuentra el diccionario");
        }

        // Leyendo el texto para la traduccion
        try{
            FileReader file = new FileReader("texto.txt");
            BufferedReader buffer = new BufferedReader(file);

            read = buffer.readLine();
            line = read.split(" ");

            // Buscando definicion
            for(int i = 0; i < line.length; i++){

                if((aux = diccionario.get(new Word<String>(line[i]))) != null)
                    System.out.println(line[i] + " se encontraron las siguientes definiciones: " + aux.getMeaning());
                else
                    System.out.println("No se encuentra " + line[i] + " en el diccionario");
            }

        } catch (Exception e){
            System.out.print("No se encuentra el archivo");
        }


    }

}

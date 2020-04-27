import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.*;

public class HashTest {

    @Test
    public void add() {
        Tree<String, String> arbol = Factory.factory("1");

        Tree<String, String> diccionario = Factory.factory("1"); //Arbol para guardar el diccionario
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

        System.out.print(diccionario.get("aback"));
    }
}
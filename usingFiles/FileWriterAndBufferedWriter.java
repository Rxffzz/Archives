package usingFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good Night"};

        String path = "C:\\Users\\Rafael\\Documents\\archives\\src\\out.txt";

        /*No caso da instanciaçao do FileWriter, removendo o True o arquivo é recriado do zero e reescrito,
        com o parametro True ele acessa o arquivo existente e grava os valores no final do arquivo*/

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){

            for (String l : lines){
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

package uf1.NF2.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CharsToFile1 {
    public static void main(String[] args) throws Exception {
        File archivo = new File("C:\\Users\\Bryan\\Desktop\\alphabeta.txt");
        try {
            PrintWriter pwInput = new PrintWriter(archivo);
            for (char i = 'a'; i <= 'z'; i++) {
                pwInput.println(i);
            }
            pwInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se ha podido encontrar");
            System.out.println(e.getMessage());
        }
    }
}

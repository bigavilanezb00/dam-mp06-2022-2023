package uf1.NF2.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NumsToFile1 {
    public static void main(String[] args) {

        File archivo = new File("C:\\Users\\Bryan\\Desktop\\Num11001200.txt");
        try {
            PrintWriter pwInput = new PrintWriter(archivo);
            for (int i = 1100; i <= 1200; i++) {
                pwInput.println(i);
            }
            pwInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se ha podido encontrar");
            System.out.println(e.getMessage());
        }

    }
}

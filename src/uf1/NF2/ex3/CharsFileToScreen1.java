package uf1.NF2.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class CharsFileToScreen1 {
    public static void main(String[] args) throws Exception {
        File archivo = new File("C:\\Users\\bryan\\Desktop\\alphabeta.txt");

        Scanner scanner = new Scanner(archivo);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine().toUpperCase() + " ");
        }
    }
}

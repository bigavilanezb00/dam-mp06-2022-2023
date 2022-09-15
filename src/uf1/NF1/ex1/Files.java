package uf1.NF1.ex1;

import java.io.File;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Introduce la ruta: ");
        String ruta = reader.nextLine();
        File fichero = new File(ruta);
        String[] archivos;
        if (fichero.exists()) {
            if (fichero.isDirectory()) {
                archivos = fichero.list();
                for (int i = 0; i < archivos.length; i++){
                    System.out.println(archivos[i]);
                }
            }
        }
    }
}

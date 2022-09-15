package uf1.NF1.ex2;

import java.io.File;
import java.util.Scanner;

public class TestFitxer {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.printf("Introdueix la ruta del fitxer: ");
        String archivo = reader.nextLine();

        File file = new File(archivo);

        if (file.exists()) {
            String nombre = file.getName();
            System.out.println("El nombre del archivo es "+ nombre);
            System.out.println("Existeix l'arxiu? " + file.exists());
            System.out.println("L'arxiu es troba a: " + file.getParentFile());
            System.out.println("Es un directori? " + file.isDirectory());
            System.out.println("Es un arxiu ocult? " +file.isHidden());

            if (file.canWrite()){
                System.out.println("L'arxiu es pot escriura");
            }

            if (file.canExecute()){
                System.out.println("L'arxiu es pot executar");

            }

            if (file.canRead()){
                System.out.println("L'arxiu es por llegir");

            }
        }

        else {
            System.out.println("El fitxer no existeix.");
        }

        reader.close();
    }
}

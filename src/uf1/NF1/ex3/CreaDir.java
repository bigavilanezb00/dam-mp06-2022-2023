package uf1.NF1.ex3;

import java.io.File;
import java.util.Scanner;

public class CreaDir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta donde quieres crear el directorio: ");

        String ruta = scanner.nextLine();
        File archivo = new File(ruta);

        archivo.mkdir();

        if (archivo.exists()) {
            System.out.println("La carpeta " + archivo + " ha sido creada con exito.");
        }
        else {
            System.out.println("No ha sido posible crear el directorio " + archivo + ".");
        }

        scanner.close();
    }
}

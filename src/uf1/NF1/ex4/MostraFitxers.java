package uf1.NF1.ex4;

import java.io.File;
import java.util.Scanner;

public class MostraFitxers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del archivo: ");

        String directorio = scanner.nextLine();
        File archivo = new File(directorio);

        String[] listado = archivo.list();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
            return;
        }
        else {
            for (int i=0; i< listado.length; i++) {
                String linea = "";
                linea = ""+listado[i]+"     ";
                File f=new File(directorio+"\\"+listado[i]);
                if (f.isDirectory())
                    linea = linea + "d";
                else
                    linea = linea + "-";


                if (f.canWrite())
                    linea = linea + "w";
                else
                    linea = linea + "-";


                if (f.canRead())
                    linea = linea + "r";
                else
                    linea = linea + "-";


                if (f.canExecute())
                    linea = linea + "x";
                else
                    linea = linea + "-";


                if (f.isHidden())
                    linea = linea + "h";
                else
                    linea = linea + "-";

                System.out.println(linea);

            }

        }
    }
}

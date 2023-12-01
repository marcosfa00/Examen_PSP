package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        Random random = new Random();
        int num = random.nextInt(1000) + 100;

        HiloEncontrar3 find3 = new HiloEncontrar3("Encontrar",frase,num);
        ContarNumLetras contar = new ContarNumLetras("Contar",frase,num);
        HiloNPalabras nPalabras = new HiloNPalabras("ContarNP",frase,num);
        HiloPenultimaPalabra pelultima = new HiloPenultimaPalabra("Penultima",frase,num);
        NcaractYPalabras ncaractYPalabras = new NcaractYPalabras("Nuemro Caracteres y palabras", frase,num);
        TerceraYPenultima terceraYPenultima = new TerceraYPenultima("mostrar Tercera y penultoma", frase,num);
        find3.start();
        contar.start();
        nPalabras.start();
        pelultima.start();
        ncaractYPalabras.start();
        terceraYPenultima.start();

        find3.join();
        contar.join();
        nPalabras.join();
        pelultima.join();
        ncaractYPalabras.join();
        terceraYPenultima.join();
    }


}

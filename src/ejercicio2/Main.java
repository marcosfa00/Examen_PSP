package ejercicio2;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int[] array100 = new int[100];
        Random random = new Random();

        for (int i = 0; i < array100.length; i++) {
            array100[i] = random.nextInt(100) + 1;
            System.out.print(array100[i] + " ");
        }

        Methods x  = new Methods();
        int[] array  = x.subArray10(array100,1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
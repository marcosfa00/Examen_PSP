package ejercicio1;

import java.util.Scanner;

public class HiloEncontrar3 extends Thread{
    private String frase;
    private int num;
    public HiloEncontrar3(String name,String frase, int num){
        super(name);
        this.frase = frase;
        this.num = num;


    }

    @Override
    public void run() {
        super.run();

        String[] palabras = frase.split(" ");
        try {
            sleep(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("La tercera palabra es: "+ palabras[2]+ " Del hilo " + getName());

    }
}

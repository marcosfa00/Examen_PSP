package ejercicio1;

public class HiloNPalabras extends Thread{

    private String frase;
    private int num;

    public HiloNPalabras(String name,String frase, int num){
        super(name);
        this.frase = frase;
        this.num = num;



    }

    @Override
    public void run() {
        super.run();

        String[] palabras = frase.split(" ");
        System.out.println("El numero de palabras de la frase es: " + palabras.length+ " Del hilo " + getName());

        try {
            sleep(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}


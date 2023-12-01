package ejercicio1;

public class HiloPenultimaPalabra extends Thread{
    private String frase;
    private int num;
    public HiloPenultimaPalabra(String name,String frase,int num){
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

        System.out.println("La penultima palabra es: " + palabras[palabras.length-2]+ " Del hilo " + getName());

    }
}

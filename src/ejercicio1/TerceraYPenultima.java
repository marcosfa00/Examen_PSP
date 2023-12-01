package ejercicio1;

public class TerceraYPenultima extends Thread{
    private String frase;
    private int num;
    public TerceraYPenultima(String name,String frase, int num) {
        super(name);
        this.frase = frase;
        this.num = num;
    }

    @Override
    public void run() {
        super.run();

        HiloEncontrar3 tercera = new HiloEncontrar3("encontrar3",frase, num);
        HiloPenultimaPalabra penultima = new HiloPenultimaPalabra("Penultima",frase , num);
        tercera.start();
        penultima.start();

        try {
            sleep(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

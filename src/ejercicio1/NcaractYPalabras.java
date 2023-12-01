package ejercicio1;

public class NcaractYPalabras extends Thread{
   private String frase;
    private int num;
    public NcaractYPalabras(String name,String frase, int num){
        super(name);
        this.frase = frase;
        this.num = num;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("El numeor total de caracteres es: "+ frase.length()+ " Del hilo " + getName());
        try {
            sleep(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        HiloNPalabras x = new HiloNPalabras("ContarNPalabras",frase , num);
        x.start();

    }
}

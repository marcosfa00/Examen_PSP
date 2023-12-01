package ejercicio1;

public class ContarNumLetras extends Thread{
    private String frase;
    private int num;
    public ContarNumLetras(String name,String frase,int num){
        super(name);
        this.frase = frase;
        this.num =num;
    }


    @Override
    public void run() {
        super.run();
        //Primero debemos eliminar los espacios
        String[] palabras = frase.split(" ");
        String juntarPalabras ="";
        for (int i = 0; i < palabras.length; i++) {
            juntarPalabras+=palabras[i];
        }
        try {
            sleep(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("El numero de letras (sin contar espacios) es: "+juntarPalabras.length() + " Del hilo " + getName());


    }
}

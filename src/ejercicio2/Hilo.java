package ejercicio2;

public class Hilo extends Thread{
    int [] num;
    public Hilo(String name, int[] num){
        super(name);
        this.num = num;
    }


    @Override
    public void run() {
        super.run();

       /* Methods x = new Methods();
        x.NumAlto(this.num);
        System.out.println("El numero alto es: " + x.NumAlto(this.num));*/

    }
}

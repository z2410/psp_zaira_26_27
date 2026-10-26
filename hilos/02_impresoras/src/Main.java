//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //se crean las impresoras
        Impresora impresoraA= new Impresora("impresora A", 3);
        Impresora impresoraB= new Impresora("impresora B", 5);
        Impresora impresoraC= new Impresora("impresora C", 4);

        //se crean los hilos
        Thread thread1= new Thread(impresoraA);
        Thread thread2= new Thread(impresoraB);
        Thread thread3= new Thread(impresoraC);

        //se ejecuta el start de cada hilo
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
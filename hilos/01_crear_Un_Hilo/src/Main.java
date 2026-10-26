//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //crear un objeto de tipo MyRunnable
        MyRunnable myRunnable= new MyRunnable();

        //crear mi primer hilo
        Thread thread= new Thread(myRunnable);
        thread.start();

        //lanzar varios hilos
        //for (int i = 0; i < 5; i++) {
            //new Thread(myRunnable).start();
        //}

        //crea dos objetos CuentaAtras
        Thread contador1= new Thread(new CuentaAtras(5));
        Thread contador2= new Thread(new CuentaAtras(6));

        //lanzando los hilos
        contador1.start();
        contador2.start();

    }

}

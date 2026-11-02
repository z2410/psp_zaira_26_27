//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //creamos un grupo de hilos
        ThreadGroup grupoHilos= new ThreadGroup("Grupo de hilos");

        //creamos 3 hilos y los almacenamos en el grupo de hilos
        Thread hilo1= new Thread(grupoHilos, new Tarea(2000), "hilo 1");
        Thread hilo2= new Thread(grupoHilos, new Tarea(4000), "hilo 2");
        Thread hilo3= new Thread(grupoHilos, new Tarea(6000), "hilo 3");

        //iniciamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

        //preguntar la informacion de los hilos activos cada segundo
        while (grupoHilos.activeCount()>0) {
            System.out.println("MAIN >> hilos activos: "+grupoHilos.activeCount());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
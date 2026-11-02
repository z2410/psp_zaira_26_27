public class Tarea implements Runnable{

    private int tiempo;

    public Tarea(int tiempo) {

        this.tiempo = tiempo;
    }

    //logica de la tarea
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+">> Trabajando...");

            //sacamos la informacion del nombre del hilo, el nombre del grupo y los hilos activos del grupo
            System.out.println(Thread.currentThread().getName()+">> Grupo: "+Thread.currentThread().getThreadGroup().getName());
            System.out.println(Thread.currentThread().getName()+">> Hilos activos: "+Thread.currentThread().getThreadGroup().activeCount());

            //esperamos a que acabe con el tiempo recibido por el constructor
            Thread.sleep(tiempo);
        }
        catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+">> Hilo interrumpido");
        }
    }
}

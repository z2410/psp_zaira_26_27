public class CuentaAtras implements Runnable{
    //definicion de variables
    private int cuentaAtras;

    //se crea estatica para cada hilo
    private static int contadorHilo=0;

    //una variable por instancia
    private final int idHilo=contadorHilo;

    //constructor
    public CuentaAtras(int cuentaAtras) {
        this.cuentaAtras = cuentaAtras;
        contadorHilo++;
    }

    @Override
    public void run() {
        //contador hacia atras
        while (cuentaAtras>0){
            System.out.println("hilo "+idHilo+": "+cuentaAtras);
            cuentaAtras--;
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

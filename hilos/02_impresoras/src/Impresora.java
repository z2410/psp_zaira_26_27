public class Impresora implements Runnable{
    //se crean las variables
    private String nombre;
    private int paginas;
    private int contadorPaginas=0;

    //el costructor solo recibe el nombre y el numero de las paginas
    public Impresora(String nombre, int paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
    }

    //se implementa el metodo de run
    @Override
    public void run() {
        //con un while se recorre las paginas con el contador
        while(contadorPaginas<paginas) {
            //imprime el nombre de la impresora, la pagina actual, y el total de las paginas
            System.out.println("impresora "+nombre+" pagina "+contadorPaginas+" de "+paginas);
            //se le añade al contador cuando se acaba de imprimir
            contadorPaginas++;
            //aqui se controla la impresion para que no la haga todo de golpe, si falla nos da la excepcion de la interrupcion
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //cuando acaba el while te dice que ya no quedan mas paginas
        System.out.println("ya no hay mas paginas");
    }
}

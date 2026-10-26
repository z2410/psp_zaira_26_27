import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

//cambiar el directorio de ejecucion de nuestro proceso
public class Main {
    static void main(String[] args) {
        //capturar directorios del sistema
        String userHome= System.getProperty("user.home");
        String userDir= System.getProperty("user.dir");

        //pantalla
        System.out.println("directorio del usuario logado: "+userHome);
        System.out.println("directorio de trabajo: "+userDir);
        try {
            ProcessBuilder pBuilder = new ProcessBuilder("ls", "-l");
            pBuilder.directory(new File(userHome));
            //creo un nuevo proceso
            Process process = pBuilder.start();

            //stream del proceso
            BufferedReader reader= new BufferedReader(new InputStreamReader(process.getInputStream()));

            reader.lines().forEach(System.out::println);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

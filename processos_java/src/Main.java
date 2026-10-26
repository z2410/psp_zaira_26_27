import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        String os = System.getProperty("os.name");
        String command="";
        String directorio="";

        if (os.toLowerCase().startsWith("linux")) {
            command="sh -c ls -l";
            directorio="/tmp";
        }
        else {

            command="cmd /c dir";
            directorio="c:/temp";
        }
        try {
            ProcessBuilder pBuilder = new ProcessBuilder(command.split("\\s"));
            pBuilder.directory(new File(directorio));
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

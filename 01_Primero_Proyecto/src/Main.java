import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  static void main(String[] args) {
    try {
      //prepara o costrulle un nuevo proceso
      ProcessBuilder pBuilder= new ProcessBuilder("ls", "-l");

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


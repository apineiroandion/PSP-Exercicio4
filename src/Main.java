import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        bucleEjecucion();
    }

    public static void bucleEjecucion(){
        boolean ejecutar = true;
        String entrada = "";
        while (ejecutar) {
            System.out.println("Introduce un comando o 'salir' para terminar");
            entrada = scanner.nextLine();
            if (entrada.equals("salir")) {
                ejecutar = false;
            }else {
                Runtime runtime = Runtime.getRuntime();
                try {
                    runtime.exec(entrada);
                } catch (Exception e) {
                    System.out.println("Error al ejecutar el comando");
                }
            }
        }
    }
}

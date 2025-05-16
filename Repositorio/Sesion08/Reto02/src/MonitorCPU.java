import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> registrosCPU = new HashSet<>();

        try {
            System.out.println("Ingresa consumos de CPU en porcentaje (enteros). Escribe -1 para terminar.");

            while (true) {
                System.out.print("CPU (%): ");
                int valor = scanner.nextInt();

                if (valor == -1) {
                    break;
                }

                if (valor < 0 || valor > 100) {
                    System.out.println("❌ Valor fuera de rango. Debe estar entre 0 y 100.");
                    continue;
                }

                if (!registrosCPU.add(valor)) {
                    System.out.println("❌ Valor duplicado: " + valor + "%");
                    continue;
                }

                if (valor > 95) {
                    throw new ConsumoCriticoException("\uD83D\uDEA8 ALERTA: Consumo crítico detectado (" + valor + "%)");
                }

                System.out.println("✔\uFE0F Registro aceptado: " + valor + "%");
            }

        } catch (InputMismatchException e) {
            System.out.println("❌Error: Debes ingresar un nÃºmero entero vÃ¡lido.");
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("✔\uFE0F Recursos cerrados correctamente.");
        }
    }
}

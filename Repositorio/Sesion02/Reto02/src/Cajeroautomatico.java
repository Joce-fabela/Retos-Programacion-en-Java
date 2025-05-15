import java.util.Scanner;

public class Cajeroautomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //inicializa objeto Scanner
        var saldo = 1000.0;
        int opcion;

        //Repetir el menú mientras la opción no sea salir
        do {
            //Mostrar menú de opciones
            System.out.println("Hola \uD83D\uDC4B! Bienvenido al cajero automático, por favor selecciona una opción");
            System.out.println("✅ 1. Consultar saldo");
            System.out.println("\uD83D\uDCB0 2. Depositar dinero");
            System.out.println("\uD83D\uDCB8 3. Retirar dinero");
            System.out.println("\uD83D\uDC4B 4. Salir");

            opcion = scanner.nextInt(); //lee la opcion por el usuario

            //Switch para las opciones del menú

            switch (opcion) {
                case 1 -> {
                    //Consultar saldo
                    System.out.println("✅ Tu saldo actual es de: $" + saldo);
                }
                case 2 -> {
                    //Depositar dinero
                    System.out.println("\uD83D\uDCB0 Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    //validamos que el depósito sea > a 0
                    if (deposito <= 0) {
                        System.out.println(" ❌ El depósito debe ser mayor a 0");
                        continue;
                    }

                    saldo += deposito; //aumenta el saldo
                    System.out.println(" ✅ Depósito exitoso. Saldo actualizado: $" + saldo);
                }
                case 3 -> {
                    //Retirar dinero
                    System.out.println("\uD83D\uDCB8 Ingrese el monto a retirar: $");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("❌ El retiro debe ser mayor a 0");
                        continue;
                    }

                    if (retiro > saldo) {
                        System.out.println(" ❌ Saldo insuficiente. Tu saldo es de: $" + saldo);
                    } else {
                        saldo -= retiro; //resta el monto del saldo
                        System.out.println("✅ Retiro exitoso. Saldo actual: $" + saldo);
                    }
                }
                case 4 -> {
                    System.out.println("\uD83D\uDC4B Gracias por utilizar el cajero. ¡Hasta pronto!");
                }
                default -> {
                    System.out.println("❌ Opción invalida. Intentelo nuevamente. ");
                }
            }
        } while (opcion != 4); //salir cuando el usuario de la opción 4

        scanner.close(); //se tiene que cerrar el scanner
    }
}

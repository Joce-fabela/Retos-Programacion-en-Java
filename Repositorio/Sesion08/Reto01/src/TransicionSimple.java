public class TransicionSimple implements TransicionHistoria {
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("El jugador decide salir de la torre y explorar el bosque oscuro...");
        } else {
            System.out.println("El jugador va al castillo en busca de su destino...");
        }
    }
}

public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(Narrador paquete) {
        System.out.println("Escena actual: " + paquete.getEscenaActual());
        System.out.println("El dragón del miedo te impide salir de la torre de pronto tienes que tomas una decisión...");
    }
}

public class MainNarrativa {
    public static void main(String[] args) {
        // Simulacion inicial
        Narrador paquete = new Narrador("Erase una vez en la torre más alta del mundo...");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}

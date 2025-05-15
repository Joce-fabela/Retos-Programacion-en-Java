public abstract class   UnidadEmergencia {
    String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    //Metodo activando la unidad
    public void activarUnidad() {
        System.out.println("\uD83D\uDEA8 Activando exitosamente la unidad: " + nombre);
    }

    public abstract void responder();
}

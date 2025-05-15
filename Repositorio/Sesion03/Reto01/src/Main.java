public class Main {
    public static void main(String[] args) {
        //Creamos un pasajero
        Pasajero pasajero = new Pasajero("Jocelyn Fabela", "JFH8545");

        //Creamos un vuelo
        Vuelo vuelo = new Vuelo(" :JKL985", "Brasil", " 18:00 hrs");

        //Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }
        //Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        //Cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        //Mostrar itineario actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realiza una nueva reservacion
        vuelo.reservarAsiento("Alejandro Barron", "ALB9826");
        System.out.println(vuelo.obtenerItinerario());
    }
}
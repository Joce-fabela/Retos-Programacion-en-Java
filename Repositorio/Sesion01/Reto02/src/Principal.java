public class Principal {
    public static void main(String[] args) {
        Entrada entrada1= new Entrada("Obra de teatro", 450);
        Entrada entrada2= new Entrada( "Concierto Lana del rey",  850);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        Entrada_record entrada3= new Entrada_record( "sinfonica de Toluca",  1200);
        entrada3.mostrarInformacion();

    }



}

public class SimuladorFarmacia {

    String nombre;
    double precio;
    double totalsindescuento;
    double descuento;
    double totaldescuento;
    boolean aplicardescuento=true;
    int piezas;


    public void mostrarInformacion(){
       System.out.println("Medicamento: " + nombre );
       System.out.println("Cantidad: " + piezas);
       System.out.println("Precio Unitario: $" + precio);
       System.out.println("Total sin descuento: $" + totalsindescuento);
       System.out.println("¿Aplica descuento?: " + aplicardescuento);
       System.out.println("Descuento: " + descuento);
       System.out.println("Total a pagar: $" + totaldescuento);

    }
}

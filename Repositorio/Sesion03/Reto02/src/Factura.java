import java.util.Optional;

public class Factura  {
    //Se realiza la encapsulación
    private double monto; //Cantidad total de la factura
    private String descripcion; //Concepto de lo facturado
    private Optional <String> rfc; //RFC del cliente puede estar presente o no

    //Creamos el constructor
    public Factura(double monto, String descripcion,String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }
    //Metodo publico que devuelve el resumen de la factura
    public String getResumen () {
        String resumen = "Factura generada: \n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: " + monto + "\n";

    //Si el rfc no esta presente se muestra un aviso
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";
        return resumen;
    }
}

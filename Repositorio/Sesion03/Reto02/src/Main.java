public class Main{
    public static void main(String[] args) {
        //Factura con RFC
        Factura facturaconrfc = new Factura(2500, "Servicio de consultoría","ABCC010101XYZ");

        //Factura sin rfc
        Factura facturasinrfc = new Factura(1800, "Reparación de equipo", null);

        //Mostrar ambas facturas
        System.out.println(facturaconrfc.getResumen());
        System.out.println(facturasinrfc.getResumen());
    }
}

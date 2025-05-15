public class Main {
    public static void main(String[] args) {

        //Se crean las facturas con el mismo folio
        Factura f1 = new Factura("FAC001", "Juan Perez", 1450);
        Factura f2 = new Factura("FAC001", "Comercial XYZ",1450);

        //Se muestran ambas facturas con toString
        System.out.println(f1);
        System.out.println(f2);

        //Se comparan si son iguales con equals
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));

    }
}
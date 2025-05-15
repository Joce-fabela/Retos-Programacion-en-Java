public class Main {
    public static void main(String[] args) {
        //Se realiza la declaracion de impuestos
        DeclaracionImpuestos declaracion = new
        DeclaracionImpuestos ("\n XAXX010101000",8700.0);

        //Creamos una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("\n XAXX010101000", 9500.0);

        //Mostramos la informacion
        System.out.println("\n \uD83D\uDCC4Declaracion exitosa por medio de RFC: " + declaracion.rfcContribuyente() + "Por la cantidad de: $ " + declaracion.montoDeclarado());
        cuenta.MostrarCuenta();

        //Validacion del RFC sea valido en la declaracion
        boolean rfcValido = cuenta.validarRfc(declaracion);
        System.out.println("\n ✅ ¿RFC valido para esta cuenta?: " + rfcValido);
    }
}
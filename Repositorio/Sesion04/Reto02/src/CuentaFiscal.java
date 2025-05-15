import java.util.Objects;

public class CuentaFiscal {

    private final String rfc; //No se puede modificar una vez asignado
    private double SaldoDisponible;

    //Constructor validando que el saldo no sea negativo
    public CuentaFiscal (String rfc, double v) {
        this.rfc = rfc;
        if (SaldoDisponible >= 0) {
            this.SaldoDisponible = SaldoDisponible;
        } else {
            System.out.println("Saldo negativo, verifica que sea mayor a 0 \n");
            this.SaldoDisponible = 0;
        }
   }

   //Getters
    public String getRfc() {
        return rfc;
    }
    public double getSaldoDisponible() {
        return SaldoDisponible;
    }

    //Metodo para validar RFC de la cuenta con la declaracion
    public boolean validarRfc(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    //Metodo para mostrar la informacion
    public void MostrarCuenta(){
        System.out.println(" ✅Cuenta fiscal registrada con RFC: " + rfc + "Saldo: $ " + SaldoDisponible);
    }
}


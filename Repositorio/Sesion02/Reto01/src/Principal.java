import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimuladorFarmacia m1 = new SimuladorFarmacia();

        System.out.print("Medicamento: ");
        m1.nombre = input.nextLine();
        System.out.print("Cantidad: ");
        m1.piezas = input.nextInt();
        System.out.print("Precio Unitario: $");
        m1.precio = input.nextDouble();

        //calcular total sin descuento
        m1.totalsindescuento = m1.precio * m1.piezas;
        //descuento si el total supera los $500
        m1.aplicardescuento = m1.totalsindescuento>500;
        //asignación del descuento
        m1.descuento = m1.aplicardescuento ? m1.totalsindescuento * 0.15: 0;
        //total con descuento
        m1.totaldescuento = m1.totalsindescuento - m1.descuento;

        m1.mostrarInformacion();
    }

}

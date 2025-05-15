public class Factura {
    private String folio;
    private String cliente;
    private double total;

    //Constructor iniciando los atributos
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "\uD83E\uDDFE Factura [folio= " + folio + ", cliente= " + cliente + "total= " + total + " ]\n";
    }

    //Metodo equals para comparar si las facturas tienen el mismo RFC
    @Override
    public boolean equals(Object obj) {
        if (this ==obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio);
    }

    //Metodo hashCode
    @Override
    public int hashCode () {
        return folio.hashCode();
    }
}

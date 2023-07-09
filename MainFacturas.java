package Ejercicio2;

public class MainFacturas {
    public static void main(String[] args) {
        FacturaInterfaz factura1 = FacturaPFactory.generarFactura("NoRmal",50000);
        System.out.println("Total con IVA de la factura de la compra 1: "+factura1.calculoIVA());
        FacturaInterfaz factura2 = FacturaPFactory.generarFactura("ESPECIAL",350000);
        System.out.println("Total con IVA de la factura de la compra 2: "+factura2.calculoIVA());
        FacturaInterfaz factura3 = FacturaPFactory.generarFactura("Otros!",586);
        System.out.println("Total con IVA de la factura de la compra 3: "+factura3.calculoIVA());

    }
}

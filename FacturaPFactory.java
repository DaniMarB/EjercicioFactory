package Ejercicio2;

public class FacturaPFactory {

    public static FacturaInterfaz generarFactura(String tipoFactura, double compra){
        switch(tipoFactura.toLowerCase()){
            case "normal":
                return new FacturaNormal(compra);
            case "especial":
                return new FacturaEspecial(compra);
            default:
                throw new IllegalArgumentException("¡Ingresa un tipo de factura valido!");
        }
    }
}

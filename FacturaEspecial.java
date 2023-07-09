package Ejercicio2;

public class FacturaEspecial implements FacturaInterfaz{
    public double compra;
    @Override
    public double calculoIVA() {
        return compra*(1+0.08);
    }

    public FacturaEspecial(double compra) {
        this.compra = compra;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }
}

package Ejercicio2;

public class FacturaNormal implements FacturaInterfaz{

    public double compra;

    public FacturaNormal(double compra) {
        this.compra = compra;
    }

    @Override
    public double calculoIVA() {
        return compra*(1+0.19);
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }
}

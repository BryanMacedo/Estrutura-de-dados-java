package pintura;

public class Pintura<E extends Pintavel> {
    private E coisaQueVouPintar;
    private String tipo;
    private String marca;
    private double preco;

    public Pintura(E coisaQueVouPintar, String tipo, String marca, double preco) {
        this.coisaQueVouPintar = coisaQueVouPintar;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    public E getCoisaQueVouPintar() {
        return coisaQueVouPintar;
    }

    public void setCoisaQueVouPintar(E coisaQueVouPintar) {
        this.coisaQueVouPintar = coisaQueVouPintar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void pintar(){
        this.coisaQueVouPintar.aplicarTinta();
    }
}
















package modelos;

public class Moto extends Vehiculo {

    private String cilindros;

    public Moto(String marca, String modelo, double precio, String cilindros) {
        super(marca, modelo, precio);
        this.cilindros = cilindros;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return
                "Marca: " + getMarca() +
                        " // Modelo: " + getModelo() +
                        " // Cilindrada: " + cilindros +
                        " // Precio: $" + getPrecio();
    }
}

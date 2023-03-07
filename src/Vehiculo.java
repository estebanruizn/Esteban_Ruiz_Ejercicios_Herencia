public class Vehiculo {

    private String marca;
    private String color;
    private int ruedas;
    private String modelo;



    public Vehiculo(String marca, String color, int ruedas, String modelo) {
        this.marca = marca;
        this.color = color;
        this.ruedas = ruedas;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", ruedas=" + ruedas +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

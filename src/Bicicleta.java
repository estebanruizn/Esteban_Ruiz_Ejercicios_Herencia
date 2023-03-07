public class Bicicleta extends Vehiculo {

    private String tipo;
    private double velocidad;


    public Bicicleta(String marca, String color, int ruedas, String modelo, String tipo, double velocidad) {
        super(marca, color, ruedas, modelo);
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+ "Bicicleta{" +
                "tipo='" + tipo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}

public class Coche extends Vehiculo {

    private int kilometraje;
    private int puertas;



    public Coche(String marca, String color, int ruedas, String modelo, int kilometraje, int puertas) {
        super(marca, color, ruedas, modelo);
        this.kilometraje = kilometraje;
        this.puertas = puertas;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Coche{" +
                "kilometraje=" + kilometraje +
                ", puertas=" + puertas +
                '}';
    }
}

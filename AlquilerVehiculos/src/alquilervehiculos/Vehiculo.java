package alquilervehiculos;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double tarifaBase;

    public Vehiculo(String marca, String modelo, double tarifaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularCostoAlquiler(int dias);

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", tarifaBase=" + tarifaBase + '}';
    }
}
package alquilervehiculos;

import java.util.List;
import java.util.ArrayList;

public class AlquilerVehiculos {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota", "Corolla", 50.0));
        vehiculos.add(new Moto("Yamaha", "FZ", 30.0));

        for (Vehiculo v : vehiculos) {
            double costo = v.calcularCostoAlquiler(5);
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Costo de alquiler por 5 días: $" + costo);

        }
    }
}
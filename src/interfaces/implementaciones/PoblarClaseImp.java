package interfaces.implementaciones;

import interfaces.IPoblarClase;
import modelos.Auto;
import modelos.Moto;
import modelos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class PoblarClaseImp implements IPoblarClase {

    @Override
    public List<Vehiculo> crearVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo v1 = new Auto("Peugeot", "206", 200000, 4);
        Vehiculo v2 = new Moto("Honda", "Titan", 60000, "125cc");
        Vehiculo v3 = new Auto("Peugeot", "208", 250000, 5);
        Vehiculo v4 = new Moto("Yamaha", "YBR", 80500.50, "160cc");

        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);

        return vehiculos;
    }
}

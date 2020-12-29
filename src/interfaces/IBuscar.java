package interfaces;

import modelos.Auto;
import modelos.Moto;
import modelos.Vehiculo;

import java.util.List;

public interface IBuscar {

    Vehiculo masCaro(List<Vehiculo> vehiculos);
    Vehiculo masBarato(List<Vehiculo> vehiculos);
    Vehiculo contieneY(List<Vehiculo> vehiculos);

    //Vehiculo ordenarPrecio(List<Vehiculo> vehiculos);
}

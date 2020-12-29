package interfaces.implementaciones;

import interfaces.IBuscar;
import modelos.Vehiculo;
import java.util.List;

public class BuscarImp implements IBuscar {


    @Override
    public Vehiculo masCaro(List<Vehiculo> vehiculos) {

        Vehiculo vehiculoMasCaro = null;

        vehiculoMasCaro= vehiculos.get(0);

        for (Vehiculo vehiculo: vehiculos) {
            if (vehiculo.getPrecio()>vehiculoMasCaro.getPrecio()){
                vehiculoMasCaro = vehiculo;
            }

        }


        return vehiculoMasCaro;
    }

    @Override
    public Vehiculo masBarato(List<Vehiculo> vehiculos) {

        Vehiculo vehiculoMasBarato = null;

        vehiculoMasBarato= vehiculos.get(0);

        for (Vehiculo vehiculo: vehiculos) {
            if (vehiculo.getPrecio()<vehiculoMasBarato.getPrecio()){
                vehiculoMasBarato = vehiculo;
            }

        }


        return vehiculoMasBarato;
    }

    @Override
    public Vehiculo contieneY(List<Vehiculo> vehiculos) {

        Vehiculo vehiculoContiene = null;

        vehiculoContiene= vehiculos.get(0);

        for (Vehiculo vehiculo: vehiculos) {
            if (vehiculo.getModelo().contains("Y")){
                vehiculoContiene = vehiculo;
            }

        }


        return vehiculoContiene;

    }




}

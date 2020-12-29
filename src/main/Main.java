package main;

import interfaces.IBuscar;
import interfaces.IPoblarClase;
import interfaces.implementaciones.BuscarImp;
import interfaces.implementaciones.PoblarClaseImp;
import modelos.Vehiculo;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IPoblarClase poblar = new PoblarClaseImp();
        IBuscar buscar = new BuscarImp();

        List<Vehiculo> vehiculos = poblar.crearVehiculos();

        for (int i = 0; i <4  ; i++) {
            System.out.println(vehiculos.get(i));
        }

        System.out.println("=============================");
        Vehiculo vMasCaro = buscar.masCaro(vehiculos);
        System.out.println("Vehículo más caro: " + vMasCaro.getMarca() + " "+ vMasCaro.getModelo());
        Vehiculo vMasBarato = buscar.masBarato(vehiculos);
        System.out.println("Vehículo más barato: " + vMasBarato.getMarca() + " "+ vMasBarato.getModelo());
        Vehiculo vContiene = buscar.contieneY(vehiculos);
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+ vContiene.getMarca() + " " + vContiene.getModelo()+ " $" + vContiene.getPrecio());

        System.out.println("=============================");

        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        Collections.sort(vehiculos, new Comparator<Vehiculo>() {
            @Override
            public int compare(Vehiculo v1, Vehiculo v2) {
                int r=0;
                if (v1.getPrecio()< v2.getPrecio()){
                    r=1;
                }else if(v1.getPrecio()> v2.getPrecio()){
                    r= -1;
                }else{
                    r=0;
                }
                return r;
            }
        });

        for (int i = 0; i <4  ; i++) {
            System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
        }

    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        vehiculos formula1 = new carro1("NJS-194", "ferrari");
        vehiculos su7 = new carro2("LHJ-627", "Xiaomi");

        ArrayList<vehiculos> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(su7);
        listaVehiculos.add(formula1);

        for (vehiculos car : listaVehiculos) {
            car.mostrarVehiculo();
            car.acelerar();
            System.out.println();
        }
    }
}

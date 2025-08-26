public class vehiculos {
    private String placa;
    private String marca;

    public vehiculos(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public void mostrarVehiculo() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
    }
    public String getMarca() { 
        return marca; 
    }

    public String getPlaca() { 
        return placa; 
    }
    public void acelerar() {
        System.out.println("run");
    }
}

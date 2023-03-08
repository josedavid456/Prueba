package Vehiculo;
public class Main {
    public static void main(String[]args){
        //Crear objetos
        Taxi taxi = new Taxi("MAZDA RX8", 2103,6,5698);
        taxi.mostrarDatos();
        
        System.out.println("---------------------------");
        
        Autobus objeto = new Autobus("ALSA 10", 694, 12, 5);
        objeto.mostrarDatos1();
    }
}

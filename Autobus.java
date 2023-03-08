package Vehiculo;
public class Autobus extends Vehiculo {
    //Atributos
    private int n_plazas;
    //Constructor
    public Autobus(String modelo, int matricula, int potenciacv, int n_plazas) {
        super(matricula, modelo, potenciacv);
        this.n_plazas = n_plazas;
    }
    public void mostrarDatos1(){
        System.out.println("BIENVENIDOS A LA EMPRESA ALSA DE ESPANIA");
        System.out.println("ESTA ES LA INFORMACION QUE DA LA EMPRESA SOBRE EL AUTOBUS");
        System.out.println("El modelo del autobus es: "+getModelo());
        System.out.println("Su numero de matricula es: "+getMatricula());
        System.out.println("La potencia que tiene este autobus es: "+getPotenciacv());
        System.out.println("El numero de plazas que tiene este autobus es: "+n_plazas);   
    }
}

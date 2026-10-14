package practica8;

public class Arma implements Inventariable {
    private String nombre;
    private int danyo;
    private double alcance;

    public Arma(String nombre, int danyo, double alcance) {
        this.nombre = nombre;
        this.danyo = danyo;
        this.alcance = alcance;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanyo() {
        return danyo;
    }

    public double getAlcance() {
        return alcance;
    }

    @Override 
    public void registrar() {
        System.out.println("Registrando el arma: " + nombre);
    }

    @Override
    public void borrar() {
        System.out.println("Borrando el arma: " + nombre);
    }
}

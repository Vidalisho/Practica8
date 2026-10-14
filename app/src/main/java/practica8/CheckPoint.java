package practica8;

public class CheckPoint {
    private String nombre;
    private int posX;
    private int posY;
    private boolean activado;

    public CheckPoint(String nombre, int posX, int posY) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
        this.activado = false;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public boolean isActivado() {
        return activado;
    }

    public void activar() {
        activado=true;
        System.out.println("Checkpoint " + nombre + " activado");

    }
}

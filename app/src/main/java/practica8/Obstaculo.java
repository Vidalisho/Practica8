package practica8;

public class Obstaculo implements Destruible {
    private String nombre;
    private int danyo;
    private int posX;
    private int posY;

    public Obstaculo(String nombre, int danyo, int posX, int posY) {
        this.nombre = nombre;
        this.danyo = danyo;
        this.posX = posX;
        this.posY = posY;
    }

    public String getNombre() {
        return nombre;
    }
    public int getDanyo() {
        return danyo;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

    @Override
    public void destruye() {
        System.out.println("Destruyendo el obstáculo: " + nombre);
    }

    
}

package practica8;

public class Personaje implements Destruible, ElementoDinamico {
    private String nombre;
    private int vida;
    private int posX;
    private int posY;

    public Personaje(String nombre, int vida, int posX, int posY) {
        this.nombre = nombre;
        this.vida = vida;
        this.posX = posX;
        this.posY = posY;
    }

    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

    public void setPos(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void recibirDanyo(int danyo) {
        vida-=danyo;

        if (vida < 0) { //validacion solo para que no quede en numeros negativos
            vida = 0;
        }

        System.out.println("El personaje " + nombre + " ha recibido " + danyo + " de daño. Vida restante: " + vida);
    }

    @Override 
    public void mover(String direccion, int distancia) { //direccion se refiere a los puntos cardinales
        switch (direccion.toLowerCase()) {
            case "norte":
                posY += distancia;
                break;
            case "sur":
                posY -= distancia;
                break;
            case "este":
                posX += distancia;
                break;
            case "oeste":
                posX -= distancia;
                break;
            default:
                System.out.println("Dirección inválida. Use 'norte', 'sur', 'este' o 'oeste'.");
                return;
        }
        System.out.println("El personaje " + nombre + " se ha movido hacia " + direccion + " a la posición (" + posX + ", " + posY + ").");
    }

    @Override 
    public void destruye() {
        System.out.println("El personaje " + nombre + " ha sido destruido.");
    }
}

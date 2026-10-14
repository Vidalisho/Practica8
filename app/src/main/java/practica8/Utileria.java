package practica8;

public class Utileria implements ElementoDinamico {
    private String nombre;
    private String desc;
    private int posX;
    private int posY;

    public Utileria(String nombre, String desc, int posX, int posY) {
        this.nombre = nombre;
        this.desc = desc;
        this.posX = posX;
        this.posY = posY;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDesc() {
        return desc;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

    public void usar() {
        System.out.println("Usando el objeto " + nombre);
    }

    @Override
    public void mover(String direccion, int distancia) {
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
        }
    }
    
}

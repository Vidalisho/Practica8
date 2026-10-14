package practica8;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nivel {
    private String nombre;
    private int numero;
    private String dificultad;
    private List<Obstaculo> obstaculos;
    private List<ElementoDinamico> elementosDinamicos;
    private List<CheckPoint> checkpoints;
    private Inventario inventario;

    public Nivel(String nombre, int numero, String dificultad, Inventario inventario) {
        this.nombre = nombre;
        this.numero = numero;
        this.dificultad = dificultad;
        this.inventario = inventario;
        this.obstaculos = new ArrayList<>();
        this.checkpoints = new ArrayList<>();
        this.elementosDinamicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumero() {
        return numero;
    }
    public String getDificultad() {
        return dificultad;
    }

    public void agregarObstaculo(Obstaculo obstaculo) {
        obstaculos.add(obstaculo);
    }

    public void agregarCheckPoint(CheckPoint checkpoint) {
        checkpoints.add(checkpoint);
    }

    public void agregarElementoDinamico(ElementoDinamico elemento) {
        elementosDinamicos.add(elemento);
    }

    public void moverElementosDinamicos() {
        String[] direcciones = {"norte", "sur", "este", "oeste"};
        Random random = new Random();

        for (ElementoDinamico e : elementosDinamicos) {
            String dir = direcciones[random.nextInt(4)];
            int distancia = random.nextInt(5) + 1;   // 1 a 5
            e.mover(dir, distancia);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nivel: " + nombre + " (Número: " + numero + ", Dificultad: " + dificultad + ")"); //info dle nivel

        System.out.println("Obstáculos:"); //info de los obstaculos
        for (Obstaculo o : obstaculos) {
            System.out.println("- " + o.getNombre() + " (Posicion: [" + o.getPosX() + ", " + o.getPosY() + "]");
        }
    }
}

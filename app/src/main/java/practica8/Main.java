package practica8;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario(5);
        inv.agregarItem(new Arma("Espada", 20, 1.5));
        inv.agregarItem(new Recompensa("Moneda de oro", 100, "moneda"));

        Nivel nivel = new Nivel("Bosque", 1, "fácil", inv);
        nivel.agregarObstaculo(new Obstaculo("Roca", 10, 3, 4));
        nivel.agregarCheckPoint(new CheckPoint("CP1", 0, 5));
        nivel.agregarElementoDinamico(new Personaje("Héroe", 100, 0, 0));
        nivel.agregarElementoDinamico(new Utileria("Caja", "Caja de madera", 2, 2));

        nivel.mostrarEstado();
        nivel.moverElementosDinamicos();
    }
}
